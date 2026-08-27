import java.util.List;

public class cbl<T extends bsq & bsu> extends bzm {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cbl(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().aa().b(dat.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == bsa.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bsu)$$0).forEach(bsu::aa_);
      }

      super.c();
   }

   private List<? extends bsq> i() {
      double $$0 = this.b.g(btw.k);
      euf $$1 = euf.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends bsq>)this.b.getClass(), $$1, brz.f);
   }
}
