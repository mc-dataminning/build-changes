import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class fih implements acz {
   private static final Logger a = LogUtils.getLogger();
   private final eqm b;
   @Nullable
   private final fis c;
   @Nullable
   private final exz d;
   private final Consumer<tf> e;
   private final sg f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;

   public fih(sg $$0, eqm $$1, @Nullable fis $$2, @Nullable exz $$3, boolean $$4, @Nullable Duration $$5, Consumer<tf> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   @Override
   public void a(adc $$0) {
      Cipher $$4;
      Cipher $$5;
      String $$3;
      adi $$7;
      try {
         SecretKey $$1 = aqp.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(aqp.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = aqp.a(2, $$1);
         $$5 = aqp.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new adi($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      this.e.accept(tf.c("connect.authorizing"));
      arh.a.submit(() -> {
         tf $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.e.accept(tf.c("connect.encrypting"));
         this.f.a($$7, sp.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private tf b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return tf.a("disconnect.loginFailedInfo", tf.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return tf.a("disconnect.loginFailedInfo", tf.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return tf.a("disconnect.loginFailedInfo", tf.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (UserBannedException var6) {
         return tf.a("disconnect.loginFailedInfo", tf.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return tf.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(adb $$0) {
      this.e.accept(tf.c("connect.joining"));
      GameProfile $$1 = $$0.a();
      this.f.a(new adj());
      this.f.a(new fig(this.b, this.f, new fim($$1, this.b.u().a(this.g, this.h, this.i), fik.a().a(), cdx.g, null, this.c, this.d)));
      this.f.a(new vi(new vo(ClientBrandRetriever.getClientModName())));
   }

   @Override
   public void a(tf $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gee(this.d, te.q, $$0));
      } else {
         this.b.a(new exb(this.d, te.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(ade $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(add $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(ada $$0) {
      this.e.accept(tf.c("connect.negotiating"));
      this.f.a(new adg($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }
}
