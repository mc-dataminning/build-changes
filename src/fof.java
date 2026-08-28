import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fof extends hrc {
   private static final Logger a = LogUtils.getLogger();
   private static final xg b = xg.c("mco.configure.world.buttons.invite");
   private static final xg c = xg.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xg C = xg.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xg D = xg.c("mco.configure.world.players.error").b(-65536);
   private final fxm E = new fxm(this);
   private fuh F;
   private fty G;
   private final fmr H;
   private final foa I;
   private final fzq J;
   @Nullable
   private xg K;

   public fof(foa $$0, fzq $$1, fmr $$2) {
      super(b);
      this.I = $$0;
      this.J = $$1;
      this.H = $$2;
   }

   @Override
   public void aO_() {
      this.E.a(b, this.p);
      fxq $$0 = this.E.c(fxq.d().a(8));
      this.F = new fuh(this.m.h, 200, 20, xg.c("mco.configure.world.invite.profile.name"));
      $$0.a(fxi.a(this.p, this.F, c));
      this.G = $$0.a(fty.a(b, $$0x -> this.E()).a(200).a());
      this.E.b(fty.a(xf.k, $$0x -> this.aL_()).a(200).a());
      this.E.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   protected void aC_() {
      this.b(this.F);
   }

   private void E() {
      if (bay.h(this.F.a())) {
         this.a(D);
      } else {
         long $$0 = this.H.a;
         String $$1 = this.F.a().trim();
         this.G.j = false;
         this.F.e(false);
         this.a(C);
         CompletableFuture.<fmr>supplyAsync(() -> {
            try {
               return flq.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ag.i()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.H.h = $$0x.h;
               this.m.a(new fol(this.I, this.H));
            } else {
               this.a(D);
            }

            this.F.e(true);
            this.G.j = true;
         }, this.r);
      }
   }

   private void a(xg $$0) {
      this.K = $$0;
      this.m.aY().c($$0);
   }

   @Override
   public void aL_() {
      this.m.a(this.J);
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.K != null) {
         $$0.a(this.p, this.K, this.n / 2, this.G.G() + this.G.y() + 8, -1);
      }
   }
}
