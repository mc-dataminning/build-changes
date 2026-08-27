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

public class fid implements acx {
   private static final Logger a = LogUtils.getLogger();
   private final eqn b;
   @Nullable
   private final fin c;
   @Nullable
   private final exv d;
   private final Consumer<te> e;
   private final sf f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;

   public fid(sf $$0, eqn $$1, @Nullable fin $$2, @Nullable exv $$3, boolean $$4, @Nullable Duration $$5, Consumer<te> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   @Override
   public void a(ada $$0) {
      Cipher $$4;
      Cipher $$5;
      String $$3;
      adg $$7;
      try {
         SecretKey $$1 = aqn.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(aqn.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = aqn.a(2, $$1);
         $$5 = aqn.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new adg($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      this.e.accept(te.c("connect.authorizing"));
      arg.a.submit(() -> {
         te $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.e.accept(te.c("connect.encrypting"));
         this.f.a($$7, so.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private te b(String $$0) {
      try {
         this.e().joinServer(this.b.U().b(), this.b.U().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return te.a("disconnect.loginFailedInfo", te.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return te.a("disconnect.loginFailedInfo", te.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return te.a("disconnect.loginFailedInfo", te.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (UserBannedException var6) {
         return te.a("disconnect.loginFailedInfo", te.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return te.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.aj();
   }

   @Override
   public void a(acz $$0) {
      this.e.accept(te.c("connect.joining"));
      GameProfile $$1 = $$0.a();
      this.f.a(new adh());
      this.f.a(new fic(this.b, this.f, new fii($$1, this.b.t().a(this.g, this.h, this.i), fig.a().a(), cdv.g, null, this.c, this.d)));
      this.f.a(new vh(new vn(ClientBrandRetriever.getClientModName())));
   }

   @Override
   public void a(te $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gdz(this.d, td.q, $$0));
      } else {
         this.b.a(new ewx(this.d, td.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(adc $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(adb $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(acy $$0) {
      this.e.accept(te.c("connect.negotiating"));
      this.f.a(new ade($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }
}
