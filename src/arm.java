import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class arm implements aip, wi {
   private static final AtomicInteger b = new AtomicInteger(0);
   static final Logger c = LogUtils.getLogger();
   private static final int d = 600;
   private final byte[] e;
   final MinecraftServer f;
   final vp g;
   private volatile arm.a h = arm.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";
   private final boolean m;

   public arm(MinecraftServer $$0, vp $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(aym.a().f());
      this.m = $$2;
   }

   @Override
   public void d() {
      if (this.h == arm.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == arm.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(wu.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.i();
   }

   public void b(wu $$0) {
      try {
         c.info("Disconnecting {}: {}", this.e(), $$0.getString());
         this.g.a(new aim($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         c.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ah().a($$0.getId()) != null;
   }

   @Override
   public void a(wu $$0) {
      c.info("{} lost connection: {}", this.e(), $$0.getString());
   }

   @Override
   public String e() {
      String $$0 = this.g.a(this.f.bn());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(air $$0) {
      Validate.validState(this.h == arm.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(aza.f($$0.b()), "Invalid characters in username", new Object[0]);
      this.j = $$0.b();
      GameProfile $$1 = this.f.S();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.Z() && !this.g.e()) {
            this.h = arm.a.b;
            this.g.a(new aik("", this.f.Q().getPublic().getEncoded(), this.e, true));
         } else {
            this.b(kd.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = arm.a.e;
   }

   private void c(GameProfile $$0) {
      auh $$1 = this.f.ah();
      wu $$2 = $$1.a(this.g.d(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.aA() >= 0 && !this.g.e()) {
            this.g.a(new ail(this.f.aA()), wb.a(() -> this.g.a(this.f.aA(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = arm.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = arm.a.g;
      this.g.a(new aij($$0, true));
   }

   @Override
   public void a(ais $$0) {
      Validate.validState(this.h == arm.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.Q().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = axb.a(2, $$2);
         Cipher $$4 = axb.a(1, $$2);
         $$5 = new BigInteger(axb.a("", this.f.Q().getPublic(), $$2)).toString(16);
         this.h = arm.a.c;
         this.g.a($$3, $$4);
      } catch (axc var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + b.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(arm.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = arm.this.f.ar().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  arm.c.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  arm.this.b($$2);
               } else if (arm.this.f.T()) {
                  arm.c.warn("Failed to verify username but will let them in anyway!");
                  arm.this.b(kd.b($$0));
               } else {
                  arm.this.b(wu.c("multiplayer.disconnect.unverified_username"));
                  arm.c.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (arm.this.f.T()) {
                  arm.c.warn("Authentication servers are down but will let them in anyway!");
                  arm.this.b(kd.b($$0));
               } else {
                  arm.this.b(wu.c("multiplayer.disconnect.authservers_down"));
                  arm.c.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = arm.this.g.d();
            return arm.this.f.aa() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(c));
      $$8.start();
   }

   @Override
   public void a(aiq $$0) {
      this.b(arh.c);
   }

   @Override
   public void a(ait $$0) {
      Validate.validState(this.h == arm.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.g.a(abc.b);
      aqz $$1 = aqz.a(Objects.requireNonNull(this.k), this.m);
      ari $$2 = new ari(this.f, this.g, $$1);
      this.g.a(abc.a, $$2);
      $$2.l();
      this.h = arm.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.h.toString());
   }

   @Override
   public void a(abl $$0) {
      this.b(arh.c);
   }

   static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }
}
