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
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class fiy implements adg {
   private static final Logger a = LogUtils.getLogger();
   private final eqx b;
   @Nullable
   private final fjj c;
   @Nullable
   private final eym d;
   private final Consumer<tn> e;
   private final so f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fiy.a> j = new AtomicReference<>(fiy.a.a);

   public fiy(so $$0, eqx $$1, @Nullable fjj $$2, @Nullable eym $$3, boolean $$4, @Nullable Duration $$5, Consumer<tn> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fiy.a $$0) {
      fiy.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(adj $$0) {
      this.a(fiy.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      adp $$7;
      try {
         SecretKey $$1 = aqy.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(aqy.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = aqy.a(2, $$1);
         $$5 = aqy.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new adp($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      arq.a.submit(() -> {
         tn $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fiy.a.c);
         this.f.a($$7, sx.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private tn b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return tn.a("disconnect.loginFailedInfo", tn.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return tn.a("disconnect.loginFailedInfo", tn.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return tn.a("disconnect.loginFailedInfo", tn.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return tn.a("disconnect.loginFailedInfo", tn.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return tn.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(adi $$0) {
      this.a(fiy.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new adq());
      this.f.a(new fix(this.b, this.f, new fjd($$1, this.b.u().a(this.g, this.h, this.i), fjb.a().a(), ceg.g, null, this.c, this.d)));
      this.f.a(new vr(new vx(ClientBrandRetriever.getClientModName())));
      this.f.a(new vq(this.b.m.as()));
   }

   @Override
   public void a(tn $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gez(this.d, tm.q, $$0));
      } else {
         this.b.a(new exo(this.d, tm.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(adl $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(adk $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(adh $$0) {
      this.e.accept(tn.c("connect.negotiating"));
      this.f.a(new adn($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(tn.c("connect.connecting"), Set.of()),
      b(tn.c("connect.authorizing"), Set.of(a)),
      c(tn.c("connect.encrypting"), Set.of(b)),
      d(tn.c("connect.joining"), Set.of(c, a));

      final tn e;
      final Set<fiy.a> f;

      private a(tn $$0, Set<fiy.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
