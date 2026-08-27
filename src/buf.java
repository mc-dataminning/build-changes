import java.util.List;

public class buf<T extends bln & bls> extends bsg {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public buf(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dN().Y().b(csb.O) && this.h();
   }

   private boolean h() {
      return this.b.ei() != null && this.b.ei().ai() == bkz.bt && this.b.ej() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ej();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bls)$$0).forEach(bls::ab_);
      }

      super.c();
   }

   private List<? extends bln> i() {
      double $$0 = this.b.b(bmr.g);
      eju $$1 = eju.a(this.b.dl()).c($$0, 10.0, $$0);
      return this.b.dN().a((Class<? extends bln>)this.b.getClass(), $$1, bky.f);
   }
}
