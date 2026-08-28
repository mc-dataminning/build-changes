import java.util.List;

public class ceu<T extends bvz & bwc> extends ccv {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ceu(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().b(dgv.P) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().aq() == bvi.bS && this.b.er() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.er();
      this.b.ae_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bwc)$$0).forEach(bwc::ae_);
      }

      super.d();
   }

   private List<? extends bvz> i() {
      double $$0 = this.b.h(bxf.m);
      fbm $$1 = fbm.a(this.b.du()).c($$0, 10.0, $$0);
      return this.b.dW().a((Class<? extends bvz>)this.b.getClass(), $$1, bvg.f);
   }
}
