import java.util.List;

public class byl<T extends bpr & bpv> extends bwm {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public byl(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Z().b(cwx.O) && this.h();
   }

   private boolean h() {
      return this.b.ej() != null && this.b.ej().ai() == bpd.by && this.b.ek() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ek();
      this.b.Z_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bpv)$$0).forEach(bpv::Z_);
      }

      super.c();
   }

   private List<? extends bpr> i() {
      double $$0 = this.b.g(bqw.k);
      epo $$1 = epo.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bpr>)this.b.getClass(), $$1, bpc.f);
   }
}
