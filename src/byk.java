import java.util.List;

public class byk<T extends bpq & bpu> extends bwl {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public byk(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Z().b(cwv.O) && this.h();
   }

   private boolean h() {
      return this.b.ej() != null && this.b.ej().ai() == bpc.bx && this.b.ek() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ek();
      this.b.Z_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bpu)$$0).forEach(bpu::Z_);
      }

      super.c();
   }

   private List<? extends bpq> i() {
      double $$0 = this.b.g(bqv.k);
      epm $$1 = epm.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bpq>)this.b.getClass(), $$1, bpb.f);
   }
}
