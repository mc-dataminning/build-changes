import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
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

public class fiw implements adf {
   private static final Logger a = LogUtils.getLogger();
   private final eqv b;
   @Nullable
   private final fjh c;
   @Nullable
   private final eyk d;
   private final Consumer<tl> e;
   private final sm f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;

   public fiw(sm $$0, eqv $$1, @Nullable fjh $$2, @Nullable eyk $$3, boolean $$4, @Nullable Duration $$5, Consumer<tl> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   @Override
   public void a(adi $$0) {
      Cipher $$4;
      Cipher $$5;
      String $$3;
      ado $$7;
      try {
         SecretKey $$1 = aqx.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(aqx.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = aqx.a(2, $$1);
         $$5 = aqx.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new ado($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      this.e.accept(tl.c("connect.authorizing"));
      arp.a.submit(() -> {
         tl $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.e.accept(tl.c("connect.encrypting"));
         this.f.a($$7, sv.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private tl b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return tl.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(adh $$0) {
      this.e.accept(tl.c("connect.joining"));
      GameProfile $$1 = $$0.a();
      this.f.a(new adp());
      this.f.a(new fiv(this.b, this.f, new fjb($$1, this.b.u().a(this.g, this.h, this.i), fiz.a().a(), cee.g, null, this.c, this.d)));
      this.f.a(new vp(new vv(ClientBrandRetriever.getClientModName())));
      this.f.a(new vo(this.b.m.as()));
   }

   @Override
   public void a(tl $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gex(this.d, tk.q, $$0));
      } else {
         this.b.a(new exm(this.d, tk.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(adk $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(adj $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(adg $$0) {
      this.e.accept(tl.c("connect.negotiating"));
      this.f.a(new adm($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }
}
