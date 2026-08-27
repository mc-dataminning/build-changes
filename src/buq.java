import java.util.List;

public class buq<T extends blx & bmc> extends bsr {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public buq(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Y().b(csu.O) && this.h();
   }

   private boolean h() {
      return this.b.eh() != null && this.b.eh().ai() == blj.bv && this.b.ei() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ei();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bmc)$$0).forEach(bmc::ab_);
      }

      super.c();
   }

   private List<? extends blx> i() {
      double $$0 = this.b.b(bnb.g);
      ekw $$1 = ekw.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends blx>)this.b.getClass(), $$1, bli.f);
   }
}
