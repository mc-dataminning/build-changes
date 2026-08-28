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

public class arv implements aiv, wm {
   private static final AtomicInteger b = new AtomicInteger(0);
   static final Logger c = LogUtils.getLogger();
   private static final int d = 600;
   private final byte[] e;
   final MinecraftServer f;
   final vs g;
   private volatile arv.a h = arv.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";
   private final boolean m;

   public arv(MinecraftServer $$0, vs $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(ayv.a().f());
      this.m = $$2;
   }

   @Override
   public void d() {
      if (this.h == arv.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == arv.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.a(wy.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.i();
   }

   public void a(wy $$0) {
      try {
         c.info("Disconnecting {}: {}", this.e(), $$0.getString());
         this.g.a(new ais($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         c.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ah().a($$0.getId()) != null;
   }

   @Override
   public void a(vu $$0) {
      c.info("{} lost connection: {}", this.e(), $$0.a().getString());
   }

   @Override
   public String e() {
      String $$0 = this.g.a(this.f.bn());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(aix $$0) {
      Validate.validState(this.h == arv.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(azk.f($$0.b()), "Invalid characters in username", new Object[0]);
      this.j = $$0.b();
      GameProfile $$1 = this.f.S();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.Z() && !this.g.e()) {
            this.h = arv.a.b;
            this.g.a(new aiq("", this.f.Q().getPublic().getEncoded(), this.e, true));
         } else {
            this.b(kg.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = arv.a.e;
   }

   private void c(GameProfile $$0) {
      auq $$1 = this.f.ah();
      wy $$2 = $$1.a(this.g.d(), $$0);
      if ($$2 != null) {
         this.a($$2);
      } else {
         if (this.f.aA() >= 0 && !this.g.e()) {
            this.g.a(new air(this.f.aA()), wf.a(() -> this.g.a(this.f.aA(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = arv.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = arv.a.g;
      this.g.a(new aip($$0, true));
   }

   @Override
   public void a(aiy $$0) {
      Validate.validState(this.h == arv.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.Q().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = axk.a(2, $$2);
         Cipher $$4 = axk.a(1, $$2);
         $$5 = new BigInteger(axk.a("", this.f.Q().getPublic(), $$2)).toString(16);
         this.h = arv.a.c;
         this.g.a($$3, $$4);
      } catch (axl var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + b.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(arv.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = arv.this.f.ar().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  arv.c.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  arv.this.b($$2);
               } else if (arv.this.f.T()) {
                  arv.c.warn("Failed to verify username but will let them in anyway!");
                  arv.this.b(kg.b($$0));
               } else {
                  arv.this.a(wy.c("multiplayer.disconnect.unverified_username"));
                  arv.c.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (arv.this.f.T()) {
                  arv.c.warn("Authentication servers are down but will let them in anyway!");
                  arv.this.b(kg.b($$0));
               } else {
                  arv.this.a(wy.c("multiplayer.disconnect.authservers_down"));
                  arv.c.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = arv.this.g.d();
            return arv.this.f.aa() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(c));
      $$8.start();
   }

   @Override
   public void a(aiw $$0) {
      this.a(arq.c);
   }

   @Override
   public void a(aiz $$0) {
      Validate.validState(this.h == arv.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.g.a(abi.b);
      ari $$1 = ari.a(Objects.requireNonNull(this.k), this.m);
      arr $$2 = new arr(this.f, this.g, $$1);
      this.g.a(abi.a, $$2);
      $$2.l();
      this.h = arv.a.h;
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Login phase", () -> this.h.toString());
   }

   @Override
   public void a(abr $$0) {
      this.a(arq.c);
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
