import java.util.List;

public class cfc<T extends bwh & bwk> extends cdd {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cfc(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).N().b(dhd.P) && this.h();
   }

   private boolean h() {
      return this.b.ep() != null && this.b.ep().aq() == bvq.bS && this.b.eq() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.eq();
      this.b.ae_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bwk)$$0).forEach(bwk::ae_);
      }

      super.d();
   }

   private List<? extends bwh> i() {
      double $$0 = this.b.h(bxn.m);
      fbs $$1 = fbs.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bwh>)this.b.getClass(), $$1, bvo.f);
   }
}
