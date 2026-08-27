import java.util.List;

public class bsg<T extends bjo & bjt> extends bqh {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bsg(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dL().X().b(cpx.K) && this.h();
   }

   private boolean h() {
      return this.b.eg() != null && this.b.eg().ag() == bja.bt && this.b.eh() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eh();
      this.b.Y_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bjt)$$0).forEach(bjt::Y_);
      }

      super.c();
   }

   private List<? extends bjo> i() {
      double $$0 = this.b.b(bks.g);
      ehc $$1 = ehc.a(this.b.dj()).c($$0, 10.0, $$0);
      return this.b.dL().a((Class<? extends bjo>)this.b.getClass(), $$1, biz.f);
   }
}
