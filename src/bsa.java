import java.util.List;

public class bsa<T extends bji & bjn> extends bqb {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bsa(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dL().X().b(cpr.K) && this.h();
   }

   private boolean h() {
      return this.b.eg() != null && this.b.eg().ag() == biu.bt && this.b.eh() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eh();
      this.b.Y_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bjn)$$0).forEach(bjn::Y_);
      }

      super.c();
   }

   private List<? extends bji> i() {
      double $$0 = this.b.b(bkm.b);
      ehi $$1 = ehi.a(this.b.dj()).c($$0, 10.0, $$0);
      return this.b.dL().a((Class<? extends bji>)this.b.getClass(), $$1, bit.f);
   }
}
