import java.util.List;

public class bzp<T extends bqv & bqz> extends bxq {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bzp(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().aa().b(czc.O) && this.h();
   }

   private boolean h() {
      return this.b.ej() != null && this.b.ej().ai() == bqg.bx && this.b.ek() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ek();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bqz)$$0).forEach(bqz::aa_);
      }

      super.c();
   }

   private List<? extends bqv> i() {
      double $$0 = this.b.g(bsa.k);
      ese $$1 = ese.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bqv>)this.b.getClass(), $$1, bqf.f);
   }
}
