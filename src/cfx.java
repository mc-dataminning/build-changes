import java.util.List;

public class cfx<T extends bxe & bxh> extends cdy {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cfx(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(dir.P) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().aq() == bwm.bS && this.b.es() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.es();
      this.b.X_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bxh)$$0).forEach(bxh::X_);
      }

      super.d();
   }

   private List<? extends bxe> i() {
      double $$0 = this.b.h(byi.m);
      fed $$1 = fed.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bxe>)this.b.getClass(), $$1, bwk.f);
   }
}
