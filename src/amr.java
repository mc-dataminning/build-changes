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

public class amr implements aei, tx {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final ui d = ui.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final tj g;
   private volatile amr.a h = amr.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public amr(MinecraftServer $$0, tj $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(ate.a().f());
   }

   @Override
   public void e() {
      if (this.h == amr.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == amr.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(ui.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(ui $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new aeh($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ac().a($$0.getId()) != null;
   }

   @Override
   public void a(ui $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.be());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(aek $$0) {
      Validate.validState(this.h == amr.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(ccx.c($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.N();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.U() && !this.g.g()) {
            this.h = amr.a.b;
            this.g.a(new aef("", this.f.L().getPublic().getEncoded(), this.e));
         } else {
            this.b(iv.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = amr.a.e;
   }

   private void c(GameProfile $$0) {
      apg $$1 = this.f.ac();
      ui $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.av() >= 0 && !this.g.g()) {
            this.g.a(new aeg(this.f.av()), ts.a(() -> this.g.a(this.f.av(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = amr.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = amr.a.g;
      this.g.a(new aee($$0));
   }

   @Override
   public void a(ael $$0) {
      Validate.validState(this.h == amr.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.L().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = arx.a(2, $$2);
         Cipher $$4 = arx.a(1, $$2);
         $$5 = new BigInteger(arx.a("", this.f.L().getPublic(), $$2)).toString(16);
         this.h = amr.a.c;
         this.g.a($$3, $$4);
      } catch (ary var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(amr.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = amr.this.f.am().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  amr.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  amr.this.b($$2);
               } else if (amr.this.f.O()) {
                  amr.b.warn("Failed to verify username but will let them in anyway!");
                  amr.this.b(iv.b($$0));
               } else {
                  amr.this.b(ui.c("multiplayer.disconnect.unverified_username"));
                  amr.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (amr.this.f.O()) {
                  amr.b.warn("Authentication servers are down but will let them in anyway!");
                  amr.this.b(iv.b($$0));
               } else {
                  amr.this.b(ui.c("multiplayer.disconnect.authservers_down"));
                  amr.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = amr.this.g.f();
            return amr.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(aej $$0) {
      this.b(d);
   }

   @Override
   public void a(aem $$0) {
      Validate.validState(this.h == amr.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      amf $$1 = amf.a(Objects.requireNonNull(this.k));
      amn $$2 = new amn(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = amr.a.h;
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
