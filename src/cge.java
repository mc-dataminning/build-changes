import java.util.List;

public class cge<T extends bxl & bxo> extends cef {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cge(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(djd.Q) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().an() == bwr.bS && this.b.es() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.es();
      this.b.Y_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bxo)$$0).forEach(bxo::Y_);
      }

      super.d();
   }

   private List<? extends bxl> i() {
      double $$0 = this.b.h(byp.m);
      fes $$1 = fes.a(this.b.ds()).c($$0, 10.0, $$0);
      return this.b.dU().a((Class<? extends bxl>)this.b.getClass(), $$1, bwp.f);
   }
}
