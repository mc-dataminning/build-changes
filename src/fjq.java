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

public class fjq implements aec {
   private static final Logger a = LogUtils.getLogger();
   private final ero b;
   @Nullable
   private final fkc c;
   @Nullable
   private final ezd d;
   private final Consumer<ui> e;
   private final tj f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fjq.a> j = new AtomicReference<>(fjq.a.a);

   public fjq(tj $$0, ero $$1, @Nullable fkc $$2, @Nullable ezd $$3, boolean $$4, @Nullable Duration $$5, Consumer<ui> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fjq.a $$0) {
      fjq.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aef $$0) {
      this.a(fjq.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ael $$7;
      try {
         SecretKey $$1 = arx.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(arx.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = arx.a(2, $$1);
         $$5 = arx.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new ael($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      asp.a.submit(() -> {
         ui $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fjq.a.c);
         this.f.a($$7, ts.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private ui b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return ui.a("disconnect.loginFailedInfo", ui.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return ui.a("disconnect.loginFailedInfo", ui.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return ui.a("disconnect.loginFailedInfo", ui.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return ui.a("disconnect.loginFailedInfo", ui.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return ui.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(aee $$0) {
      this.a(fjq.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new aem());
      this.f.a(new fjp(this.b, this.f, new fjv($$1, this.b.u().a(this.g, this.h, this.i), fjt.a().a(), cfi.g, null, this.c, this.d)));
      this.f.a(new wn(new wt(ClientBrandRetriever.getClientModName())));
      this.f.a(new wm(this.b.m.as()));
   }

   @Override
   public void a(ui $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gft(this.d, uh.q, $$0));
      } else {
         this.b.a(new eyg(this.d, uh.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(aeh $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(aeg $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(aed $$0) {
      this.e.accept(ui.c("connect.negotiating"));
      this.f.a(new aej($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(ui.c("connect.connecting"), Set.of()),
      b(ui.c("connect.authorizing"), Set.of(a)),
      c(ui.c("connect.encrypting"), Set.of(b)),
      d(ui.c("connect.joining"), Set.of(c, a));

      final ui e;
      final Set<fjq.a> f;

      private a(ui $$0, Set<fjq.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
