import java.util.List;

public class cbk<T extends bsq & bsu> extends bzl {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cbk(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dU().ab().b(dbw.P) && this.h();
   }

   private boolean h() {
      return this.b.eu() != null && this.b.eu().ak() == bsb.bE && this.b.ev() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ev();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bsu)$$0).forEach(bsu::ab_);
      }

      super.c();
   }

   private List<? extends bsq> i() {
      double $$0 = this.b.g(btv.k);
      ewp $$1 = ewp.a(this.b.ds()).c($$0, 10.0, $$0);
      return this.b.dU().a((Class<? extends bsq>)this.b.getClass(), $$1, bsa.f);
   }
}
