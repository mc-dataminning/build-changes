import java.util.List;

public class cby<T extends btd & bth> extends bzz {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cby(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dQ().ab().b(dcb.O) && this.h();
   }

   private boolean h() {
      return this.b.ej() != null && this.b.ej().al() == bsm.by && this.b.ek() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ek();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bth)$$0).forEach(bth::aa_);
      }

      super.c();
   }

   private List<? extends btd> i() {
      double $$0 = this.b.g(buj.m);
      ewa $$1 = ewa.a(this.b.do()).c($$0, 10.0, $$0);
      return this.b.dQ().a((Class<? extends btd>)this.b.getClass(), $$1, bsl.f);
   }
}
