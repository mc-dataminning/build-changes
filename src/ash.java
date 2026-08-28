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

public class ash implements ajk, xd {
   private static final AtomicInteger b = new AtomicInteger(0);
   static final Logger c = LogUtils.getLogger();
   private static final int d = 600;
   private final byte[] e;
   final MinecraftServer f;
   final wk g;
   private volatile ash.a h = ash.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";
   private final boolean m;

   public ash(MinecraftServer $$0, wk $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(azh.a().f());
      this.m = $$2;
   }

   @Override
   public void d() {
      if (this.h == ash.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == ash.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(xp.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.i();
   }

   public void b(xp $$0) {
      try {
         c.info("Disconnecting {}: {}", this.e(), $$0.getString());
         this.g.a(new ajh($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         c.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ah().a($$0.getId()) != null;
   }

   @Override
   public void a(xp $$0) {
      c.info("{} lost connection: {}", this.e(), $$0.getString());
   }

   @Override
   public String e() {
      String $$0 = this.g.a(this.f.bn());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(ajm $$0) {
      Validate.validState(this.h == ash.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(azv.f($$0.b()), "Invalid characters in username", new Object[0]);
      this.j = $$0.b();
      GameProfile $$1 = this.f.S();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.Z() && !this.g.e()) {
            this.h = ash.a.b;
            this.g.a(new ajf("", this.f.Q().getPublic().getEncoded(), this.e, true));
         } else {
            this.b(kc.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = ash.a.e;
   }

   private void c(GameProfile $$0) {
      avd $$1 = this.f.ah();
      xp $$2 = $$1.a(this.g.d(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.aA() >= 0 && !this.g.e()) {
            this.g.a(new ajg(this.f.aA()), ww.a(() -> this.g.a(this.f.aA(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = ash.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = ash.a.g;
      this.g.a(new aje($$0, true));
   }

   @Override
   public void a(ajn $$0) {
      Validate.validState(this.h == ash.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.Q().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = axw.a(2, $$2);
         Cipher $$4 = axw.a(1, $$2);
         $$5 = new BigInteger(axw.a("", this.f.Q().getPublic(), $$2)).toString(16);
         this.h = ash.a.c;
         this.g.a($$3, $$4);
      } catch (axx var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + b.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(ash.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = ash.this.f.ar().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  ash.c.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  ash.this.b($$2);
               } else if (ash.this.f.T()) {
                  ash.c.warn("Failed to verify username but will let them in anyway!");
                  ash.this.b(kc.b($$0));
               } else {
                  ash.this.b(xp.c("multiplayer.disconnect.unverified_username"));
                  ash.c.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (ash.this.f.T()) {
                  ash.c.warn("Authentication servers are down but will let them in anyway!");
                  ash.this.b(kc.b($$0));
               } else {
                  ash.this.b(xp.c("multiplayer.disconnect.authservers_down"));
                  ash.c.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = ash.this.g.d();
            return ash.this.f.aa() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(c));
      $$8.start();
   }

   @Override
   public void a(ajl $$0) {
      this.b(asc.c);
   }

   @Override
   public void a(ajo $$0) {
      Validate.validState(this.h == ash.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.g.a(abx.b);
      aru $$1 = aru.a(Objects.requireNonNull(this.k), this.m);
      asd $$2 = new asd(this.f, this.g, $$1);
      this.g.a(abx.a, $$2);
      $$2.l();
      this.h = ash.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.h.toString());
   }

   @Override
   public void a(acg $$0) {
      this.b(asc.c);
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
