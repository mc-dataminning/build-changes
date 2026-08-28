import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkt extends hne {
   private static final Logger a = LogUtils.getLogger();
   private static final wv b = wv.c("mco.configure.world.buttons.invite");
   private static final wv c = wv.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wv C = wv.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wv D = wv.c("mco.configure.world.players.error").b(-65536);
   private final fub E = new fub(this);
   private fqw F;
   private fqn G;
   private final fjf H;
   private final fko I;
   private final fwf J;
   @Nullable
   private wv K;

   public fkt(fko $$0, fwf $$1, fjf $$2) {
      super(b);
      this.I = $$0;
      this.J = $$1;
      this.H = $$2;
   }

   @Override
   public void aN_() {
      this.E.a(b, this.p);
      fuf $$0 = this.E.c(fuf.d().a(8));
      this.F = new fqw(this.m.h, 200, 20, wv.c("mco.configure.world.invite.profile.name"));
      $$0.a(ftx.a(this.p, this.F, c));
      this.G = $$0.a(fqn.a(b, $$0x -> this.E()).a(200).a());
      this.E.b(fqn.a(wu.k, $$0x -> this.aK_()).a(200).a());
      this.E.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   protected void aB_() {
      this.b(this.F);
   }

   private void E() {
      if (bah.h(this.F.a())) {
         this.a(D);
      } else {
         long $$0 = this.H.a;
         String $$1 = this.F.a().trim();
         this.G.j = false;
         this.F.e(false);
         this.a(C);
         CompletableFuture.<fjf>supplyAsync(() -> {
            try {
               return fie.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, af.i()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.H.h = $$0x.h;
               this.m.a(new fkz(this.I, this.H));
            } else {
               this.a(D);
            }

            this.F.e(true);
            this.G.j = true;
         }, this.r);
      }
   }

   private void a(wv $$0) {
      this.K = $$0;
      this.m.aY().c($$0);
   }

   @Override
   public void aK_() {
      this.m.a(this.J);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.K != null) {
         $$0.a(this.p, this.K, this.n / 2, this.G.G() + this.G.y() + 8, -1);
      }
   }
}
