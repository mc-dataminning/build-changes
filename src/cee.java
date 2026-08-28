import java.util.List;

public class cee<T extends bvj & bvm> extends ccf {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cee(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).N().b(dfi.O) && this.h();
   }

   private boolean h() {
      return this.b.ep() != null && this.b.ep().aq() == bus.bO && this.b.eq() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.eq();
      this.b.ad_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bvm)$$0).forEach(bvm::ad_);
      }

      super.d();
   }

   private List<? extends bvj> i() {
      double $$0 = this.b.h(bwp.m);
      ezt $$1 = ezt.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bvj>)this.b.getClass(), $$1, buq.f);
   }
}
