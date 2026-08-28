import java.util.List;

public class cfm<T extends bwt & bww> extends cdn {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cfm(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(dhl.P) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().aq() == bwb.bR && this.b.es() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.es();
      this.b.X_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bww)$$0).forEach(bww::X_);
      }

      super.d();
   }

   private List<? extends bwt> i() {
      double $$0 = this.b.h(bxx.m);
      fcp $$1 = fcp.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bwt>)this.b.getClass(), $$1, bvz.f);
   }
}
