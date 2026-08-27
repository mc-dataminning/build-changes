import java.util.List;

public class bva<T extends bmh & bmm> extends btb {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bva(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Z().b(cte.O) && this.h();
   }

   private boolean h() {
      return this.b.eh() != null && this.b.eh().ai() == blt.bv && this.b.ei() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ei();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bmm)$$0).forEach(bmm::ab_);
      }

      super.c();
   }

   private List<? extends bmh> i() {
      double $$0 = this.b.b(bnl.g);
      elh $$1 = elh.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bmh>)this.b.getClass(), $$1, bls.f);
   }
}
