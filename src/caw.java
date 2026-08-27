import java.util.List;

public class caw<T extends bsc & bsg> extends byx {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public caw(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dN().aa().b(czz.O) && this.h();
   }

   private boolean h() {
      return this.b.ek() != null && this.b.ek().ai() == brn.bx && this.b.el() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.el();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bsg)$$0).forEach(bsg::aa_);
      }

      super.c();
   }

   private List<? extends bsc> i() {
      double $$0 = this.b.g(bth.k);
      etk $$1 = etk.a(this.b.dl()).c($$0, 10.0, $$0);
      return this.b.dN().a((Class<? extends bsc>)this.b.getClass(), $$1, brm.f);
   }
}
