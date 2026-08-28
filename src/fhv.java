import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhv extends hfq {
   private static final Logger a = LogUtils.getLogger();
   private static final xj b = xj.c("mco.configure.world.buttons.invite");
   private static final xj c = xj.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xj B = xj.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xj C = xj.c("mco.configure.world.players.error").b(-65536);
   private final fps D = new fps(this);
   private fmm E;
   private fmd F;
   private final fgi G;
   private final fhq H;
   private final frw I;
   @Nullable
   private xj J;

   public fhv(fhq $$0, frw $$1, fgi $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aR_() {
      this.D.a(b, this.p);
      fpw $$0 = this.D.c(fpw.d().a(8));
      this.E = new fmm(this.m.h, 200, 20, xj.c("mco.configure.world.invite.profile.name"));
      $$0.a(fpo.a(this.p, this.E, c));
      this.F = $$0.a(fmd.a(b, $$0x -> this.F()).a(200).a());
      this.D.b(fmd.a(xi.k, $$0x -> this.aO_()).a(200).a());
      this.D.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aF_() {
      this.b(this.E);
   }

   private void F() {
      if (baj.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fgi>supplyAsync(() -> {
            try {
               return ffh.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ae.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fib(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.r);
      }
   }

   private void a(xj $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void aO_() {
      this.m.a(this.I);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.E() + this.F.w() + 8, -1);
      }
   }
}
