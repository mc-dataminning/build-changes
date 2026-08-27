import java.util.List;

public class bzk<T extends bqq & bqu> extends bxl {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bzk(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().aa().b(cyt.O) && this.h();
   }

   private boolean h() {
      return this.b.ej() != null && this.b.ej().ai() == bqb.bx && this.b.ek() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ek();
      this.b.Z_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bqu)$$0).forEach(bqu::Z_);
      }

      super.c();
   }

   private List<? extends bqq> i() {
      double $$0 = this.b.g(brv.k);
      erv $$1 = erv.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bqq>)this.b.getClass(), $$1, bqa.f);
   }
}
