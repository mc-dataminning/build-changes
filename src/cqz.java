import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqz extends cqx {
   private static final dgs f = new dhs(true, false, Optional.of(1.22F), ma.e.a(axk.cB).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azu.l(3.5F);
   private int i = 5;

   public cqz(bvi<? extends cqx> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqz(cpo $$0, dgz $$1, double $$2, double $$3, double $$4) {
      super(bvi.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public cqz(dgz $$0, double $$1, double $$2, double $$3, fbr $$4) {
      super(bvi.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cqi $$0, @Nullable bvb $$1, @Nullable bvb $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fbr $$0) {
      this.dW().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dgz.a.e, ls.A, ls.z, awv.Df);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
