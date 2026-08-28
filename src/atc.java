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

public class atc implements ajs, wy {
   private static final AtomicInteger b = new AtomicInteger(0);
   static final Logger c = LogUtils.getLogger();
   private static final int d = 600;
   private final byte[] e;
   final MinecraftServer f;
   final we g;
   private volatile atc.a h = atc.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";
   private final boolean m;

   public atc(MinecraftServer $$0, we $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(bac.a().f());
      this.m = $$2;
   }

   @Override
   public void d() {
      if (this.h == atc.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == atc.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.a(xk.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.i();
   }

   public void a(xk $$0) {
      try {
         c.info("Disconnecting {}: {}", this.e(), $$0.getString());
         this.g.a(new ajo($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         c.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ag().a($$0.getId()) != null;
   }

   @Override
   public void a(wg $$0) {
      c.info("{} lost connection: {}", this.e(), $$0.a().getString());
   }

   @Override
   public String e() {
      String $$0 = this.g.a(this.f.bl());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(aju $$0) {
      Validate.validState(this.h == atc.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(bar.f($$0.b()), "Invalid characters in username", new Object[0]);
      this.j = $$0.b();
      GameProfile $$1 = this.f.T();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.aa() && !this.g.e()) {
            this.h = atc.a.b;
            this.g.a(new ajm("", this.f.R().getPublic().getEncoded(), this.e, true));
         } else {
            this.b(kk.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = atc.a.e;
   }

   private void c(GameProfile $$0) {
      avy $$1 = this.f.ag();
      xk $$2 = $$1.a(this.g.d(), $$0);
      if ($$2 != null) {
         this.a($$2);
      } else {
         if (this.f.az() >= 0 && !this.g.e()) {
            this.g.a(new ajn(this.f.az()), wr.a(() -> this.g.a(this.f.az(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = atc.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = atc.a.g;
      this.g.a(new ajp($$0));
   }

   @Override
   public void a(ajv $$0) {
      Validate.validState(this.h == atc.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.R().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = ays.a(2, $$2);
         Cipher $$4 = ays.a(1, $$2);
         $$5 = new BigInteger(ays.a("", this.f.R().getPublic(), $$2)).toString(16);
         this.h = atc.a.c;
         this.g.a($$3, $$4);
      } catch (ayt var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + b.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(atc.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = atc.this.f.aq().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  atc.c.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  atc.this.b($$2);
               } else if (atc.this.f.U()) {
                  atc.c.warn("Failed to verify username but will let them in anyway!");
                  atc.this.b(kk.b($$0));
               } else {
                  atc.this.a(xk.c("multiplayer.disconnect.unverified_username"));
                  atc.c.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (atc.this.f.U()) {
                  atc.c.warn("Authentication servers are down but will let them in anyway!");
                  atc.this.b(kk.b($$0));
               } else {
                  atc.this.a(xk.c("multiplayer.disconnect.authservers_down"));
                  atc.c.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = atc.this.g.d();
            return atc.this.f.ab() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(c));
      $$8.start();
   }

   @Override
   public void a(ajt $$0) {
      this.a(asx.c);
   }

   @Override
   public void a(ajw $$0) {
      Validate.validState(this.h == atc.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.g.a(abv.d);
      asn $$1 = asn.a(Objects.requireNonNull(this.k), this.m);
      asy $$2 = new asy(this.f, this.g, $$1);
      this.g.a(abv.b, $$2);
      $$2.l();
      this.h = atc.a.h;
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Login phase", () -> this.h.toString());
   }

   @Override
   public void a(ace $$0) {
      this.a(asx.c);
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
