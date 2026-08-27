import java.util.List;

public class brv<T extends bjd & bji> extends bpw {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public brv(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dK().X().b(cpm.K) && this.h();
   }

   private boolean h() {
      return this.b.ef() != null && this.b.ef().ag() == bip.bt && this.b.eg() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eg();
      this.b.T_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bji)$$0).forEach(bji::T_);
      }

      super.c();
   }

   private List<? extends bjd> i() {
      double $$0 = this.b.b(bkh.b);
      ehd $$1 = ehd.a(this.b.di()).c($$0, 10.0, $$0);
      return this.b.dK().a((Class<? extends bjd>)this.b.getClass(), $$1, bio.f);
   }
}
