import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ctl extends ctj {
   private static final djr f = new dkq(true, false, Optional.of(1.22F), mg.e.a(axe.cF).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azo.l(3.5F);
   private int i = 5;

   public ctl(bxc<? extends ctj> $$0, djx $$1) {
      super($$0, $$1);
   }

   public ctl(crx $$0, djx $$1, double $$2, double $$3, double $$4) {
      super(bxc.bI, $$1, $$0, $$2, $$3, $$4);
   }

   public ctl(djx $$0, double $$1, double $$2, double $$3, ffq $$4) {
      super(bxc.bI, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cst $$0, @Nullable bwt $$1, @Nullable bwt $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ffq $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, djx.a.e, ly.A, ly.z, awp.Du);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
