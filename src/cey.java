import java.util.List;

public class cey<T extends bwd & bwg> extends ccz {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cey(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).N().b(dgw.O) && this.h();
   }

   private boolean h() {
      return this.b.ep() != null && this.b.ep().aq() == bvm.bS && this.b.eq() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.eq();
      this.b.ae_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bwg)$$0).forEach(bwg::ae_);
      }

      super.d();
   }

   private List<? extends bwd> i() {
      double $$0 = this.b.h(bxj.m);
      fbn $$1 = fbn.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bwd>)this.b.getClass(), $$1, bvk.f);
   }
}
