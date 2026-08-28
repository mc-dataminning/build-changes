import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class crd extends crb {
   private static final dgt f = new dht(true, false, Optional.of(1.22F), ma.e.a(axu.cB).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = bae.l(3.5F);
   private int i = 5;

   public crd(bvm<? extends crb> $$0, dha $$1) {
      super($$0, $$1);
   }

   public crd(cps $$0, dha $$1, double $$2, double $$3, double $$4) {
      super(bvm.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public crd(dha $$0, double $$1, double $$2, double $$3, fbs $$4) {
      super(bvm.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cqm $$0, @Nullable bvf $$1, @Nullable bvf $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fbs $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dha.a.e, ls.A, ls.z, axf.CO);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
