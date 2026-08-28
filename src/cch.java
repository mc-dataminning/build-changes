import java.util.List;

public class cch<T extends btm & btq> extends cai {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cch(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().ab().b(dbp.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == bsv.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btq)$$0).forEach(btq::aa_);
      }

      super.c();
   }

   private List<? extends btm> i() {
      double $$0 = this.b.g(bus.k);
      evh $$1 = evh.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends btm>)this.b.getClass(), $$1, bsu.f);
   }
}
