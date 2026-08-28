import java.util.List;

public class cbv<T extends bta & bte> extends bzw {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cbv(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().ab().b(dbz.O) && this.h();
   }

   private boolean h() {
      return this.b.ei() != null && this.b.ei().ak() == bsj.by && this.b.ej() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ej();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bte)$$0).forEach(bte::aa_);
      }

      super.c();
   }

   private List<? extends bta> i() {
      double $$0 = this.b.g(bug.m);
      evu $$1 = evu.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends bta>)this.b.getClass(), $$1, bsi.f);
   }
}
