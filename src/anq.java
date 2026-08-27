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

public class anq implements aff, uq {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final vb d = vb.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final uc g;
   private volatile anq.a h = anq.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public anq(MinecraftServer $$0, uc $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(auf.a().f());
   }

   @Override
   public void e() {
      if (this.h == anq.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == anq.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(vb.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(vb $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new afe($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ae().a($$0.getId()) != null;
   }

   @Override
   public void a(vb $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.bj());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(afh $$0) {
      Validate.validState(this.h == anq.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(cer.c($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.P();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.W() && !this.g.g()) {
            this.h = anq.a.b;
            this.g.a(new afc("", this.f.N().getPublic().getEncoded(), this.e));
         } else {
            this.b(iy.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = anq.a.e;
   }

   private void c(GameProfile $$0) {
      aqf $$1 = this.f.ae();
      vb $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.ax() >= 0 && !this.g.g()) {
            this.g.a(new afd(this.f.ax()), ul.a(() -> this.g.a(this.f.ax(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = anq.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = anq.a.g;
      this.g.a(new afb($$0));
   }

   @Override
   public void a(afi $$0) {
      Validate.validState(this.h == anq.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.N().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = asw.a(2, $$2);
         Cipher $$4 = asw.a(1, $$2);
         $$5 = new BigInteger(asw.a("", this.f.N().getPublic(), $$2)).toString(16);
         this.h = anq.a.c;
         this.g.a($$3, $$4);
      } catch (asx var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(anq.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = anq.this.f.ao().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  anq.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  anq.this.b($$2);
               } else if (anq.this.f.Q()) {
                  anq.b.warn("Failed to verify username but will let them in anyway!");
                  anq.this.b(iy.b($$0));
               } else {
                  anq.this.b(vb.c("multiplayer.disconnect.unverified_username"));
                  anq.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (anq.this.f.Q()) {
                  anq.b.warn("Authentication servers are down but will let them in anyway!");
                  anq.this.b(iy.b($$0));
               } else {
                  anq.this.b(vb.c("multiplayer.disconnect.authservers_down"));
                  anq.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = anq.this.g.f();
            return anq.this.f.X() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(afg $$0) {
      this.b(d);
   }

   @Override
   public void a(afj $$0) {
      Validate.validState(this.h == anq.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      ane $$1 = ane.a(Objects.requireNonNull(this.k));
      anm $$2 = new anm(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = anq.a.h;
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
