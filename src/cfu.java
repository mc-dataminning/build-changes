import java.util.List;

public class cfu<T extends bxb & bxe> extends cdv {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cfu(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(dil.P) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().aq() == bwj.bS && this.b.es() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.es();
      this.b.X_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bxe)$$0).forEach(bxe::X_);
      }

      super.d();
   }

   private List<? extends bxb> i() {
      double $$0 = this.b.h(byf.m);
      fdr $$1 = fdr.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bxb>)this.b.getClass(), $$1, bwh.f);
   }
}
