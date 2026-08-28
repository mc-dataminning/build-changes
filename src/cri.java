import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cri extends crg {
   private static final dhb f = new dib(true, false, Optional.of(1.22F), ma.e.a(axu.cB).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = bae.l(3.5F);
   private int i = 5;

   public cri(bvr<? extends crg> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cri(cpx $$0, dhi $$1, double $$2, double $$3, double $$4) {
      super(bvr.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public cri(dhi $$0, double $$1, double $$2, double $$3, fby $$4) {
      super(bvr.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cqr $$0, @Nullable bvk $$1, @Nullable bvk $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fby $$0) {
      this.dW().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dhi.a.e, ls.A, ls.z, axf.CP);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
