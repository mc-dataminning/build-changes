import java.util.List;

public class bvf<T extends bmm & bmr> extends btg {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bvf(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Z().b(ctk.O) && this.h();
   }

   private boolean h() {
      return this.b.eh() != null && this.b.eh().ai() == bly.bv && this.b.ei() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ei();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bmr)$$0).forEach(bmr::ab_);
      }

      super.c();
   }

   private List<? extends bmm> i() {
      double $$0 = this.b.b(bnq.g);
      eln $$1 = eln.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bmm>)this.b.getClass(), $$1, blx.f);
   }
}
