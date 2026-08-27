import java.util.List;

public class caa<T extends brg & brk> extends byb {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public caa(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dN().aa().b(czq.O) && this.h();
   }

   private boolean h() {
      return this.b.ek() != null && this.b.ek().ai() == bqr.bx && this.b.el() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.el();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (brk)$$0).forEach(brk::aa_);
      }

      super.c();
   }

   private List<? extends brg> i() {
      double $$0 = this.b.g(bsl.k);
      eta $$1 = eta.a(this.b.dl()).c($$0, 10.0, $$0);
      return this.b.dN().a((Class<? extends brg>)this.b.getClass(), $$1, bqq.f);
   }
}
