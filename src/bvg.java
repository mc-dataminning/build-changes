import java.util.List;

public class bvg<T extends bmn & bms> extends bth {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bvg(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Z().b(ctl.O) && this.h();
   }

   private boolean h() {
      return this.b.eh() != null && this.b.eh().ai() == blz.bv && this.b.ei() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ei();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bms)$$0).forEach(bms::ab_);
      }

      super.c();
   }

   private List<? extends bmn> i() {
      double $$0 = this.b.b(bnr.g);
      elo $$1 = elo.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bmn>)this.b.getClass(), $$1, bly.f);
   }
}
