import java.util.List;

public class cef<T extends bvk & bvn> extends ccg {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cef(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().b(dgf.P) && this.h();
   }

   private boolean h() {
      return this.b.ep() != null && this.b.ep().aq() == but.bR && this.b.eq() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.eq();
      this.b.ad_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bvn)$$0).forEach(bvn::ad_);
      }

      super.d();
   }

   private List<? extends bvk> i() {
      double $$0 = this.b.h(bwq.m);
      faw $$1 = faw.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bvk>)this.b.getClass(), $$1, bur.f);
   }
}
