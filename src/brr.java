import java.util.List;

public class brr<T extends biy & bjd> extends bps {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public brr(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dK().X().b(cpg.K) && this.h();
   }

   private boolean h() {
      return this.b.ef() != null && this.b.ef().ag() == bik.bt && this.b.eg() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eg();
      this.b.T_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bjd)$$0).forEach(bjd::T_);
      }

      super.c();
   }

   private List<? extends biy> i() {
      double $$0 = this.b.b(bkd.b);
      eha $$1 = eha.a(this.b.di()).c($$0, 10.0, $$0);
      return this.b.dK().a((Class<? extends biy>)this.b.getClass(), $$1, bij.f);
   }
}
