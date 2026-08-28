import java.util.List;

public class cfz<T extends bxg & bxj> extends cea {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cfz(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(diw.Q) && this.h();
   }

   private boolean h() {
      return this.b.er() != null && this.b.er().aq() == bwo.bS && this.b.et() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.et();
      this.b.Y_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bxj)$$0).forEach(bxj::Y_);
      }

      super.d();
   }

   private List<? extends bxg> i() {
      double $$0 = this.b.h(byk.m);
      fel $$1 = fel.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bxg>)this.b.getClass(), $$1, bwm.f);
   }
}
