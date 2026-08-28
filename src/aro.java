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

public class aro implements aip, wi {
   private static final AtomicInteger b = new AtomicInteger(0);
   static final Logger c = LogUtils.getLogger();
   private static final int d = 600;
   private final byte[] e;
   final MinecraftServer f;
   final vp g;
   private volatile aro.a h = aro.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";
   private final boolean m;

   public aro(MinecraftServer $$0, vp $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(ayo.a().f());
      this.m = $$2;
   }

   @Override
   public void d() {
      if (this.h == aro.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == aro.a.f && !this.a(Objects.requireNonNull(this.k))) {
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
      return this.f.ai().a($$0.getId()) != null;
   }

   @Override
   public void a(wu $$0) {
      c.info("{} lost connection: {}", this.e(), $$0.getString());
   }

   @Override
   public String e() {
      String $$0 = this.g.a(this.f.bo());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(air $$0) {
      Validate.validState(this.h == aro.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(azd.f($$0.b()), "Invalid characters in username", new Object[0]);
      this.j = $$0.b();
      GameProfile $$1 = this.f.T();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.aa() && !this.g.e()) {
            this.h = aro.a.b;
            this.g.a(new aik("", this.f.R().getPublic().getEncoded(), this.e, true));
         } else {
            this.b(kd.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = aro.a.e;
   }

   private void c(GameProfile $$0) {
      auj $$1 = this.f.ai();
      wu $$2 = $$1.a(this.g.d(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.aB() >= 0 && !this.g.e()) {
            this.g.a(new ail(this.f.aB()), wb.a(() -> this.g.a(this.f.aB(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = aro.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = aro.a.g;
      this.g.a(new aij($$0, true));
   }

   @Override
   public void a(ais $$0) {
      Validate.validState(this.h == aro.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.R().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = axd.a(2, $$2);
         Cipher $$4 = axd.a(1, $$2);
         $$5 = new BigInteger(axd.a("", this.f.R().getPublic(), $$2)).toString(16);
         this.h = aro.a.c;
         this.g.a($$3, $$4);
      } catch (axe var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + b.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(aro.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = aro.this.f.as().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  aro.c.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  aro.this.b($$2);
               } else if (aro.this.f.U()) {
                  aro.c.warn("Failed to verify username but will let them in anyway!");
                  aro.this.b(kd.b($$0));
               } else {
                  aro.this.b(wu.c("multiplayer.disconnect.unverified_username"));
                  aro.c.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (aro.this.f.U()) {
                  aro.c.warn("Authentication servers are down but will let them in anyway!");
                  aro.this.b(kd.b($$0));
               } else {
                  aro.this.b(wu.c("multiplayer.disconnect.authservers_down"));
                  aro.c.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aro.this.g.d();
            return aro.this.f.ab() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(c));
      $$8.start();
   }

   @Override
   public void a(aiq $$0) {
      this.b(arj.c);
   }

   @Override
   public void a(ait $$0) {
      Validate.validState(this.h == aro.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.g.a(abc.b);
      arb $$1 = arb.a(Objects.requireNonNull(this.k), this.m);
      ark $$2 = new ark(this.f, this.g, $$1);
      this.g.a(abc.a, $$2);
      $$2.l();
      this.h = aro.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.h.toString());
   }

   @Override
   public void a(abl $$0) {
      this.b(arj.c);
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
