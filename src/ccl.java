import java.util.List;

public class ccl<T extends btq & btu> extends cam {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ccl(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().ab().b(dbt.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == bsz.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btu)$$0).forEach(btu::aa_);
      }

      super.c();
   }

   private List<? extends btq> i() {
      double $$0 = this.b.g(buw.k);
      evl $$1 = evl.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends btq>)this.b.getClass(), $$1, bsy.f);
   }
}
