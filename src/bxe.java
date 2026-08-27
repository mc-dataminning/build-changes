import java.util.List;

public class bxe<T extends bok & boo> extends bvf {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bxe(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Z().b(cvn.O) && this.h();
   }

   private boolean h() {
      return this.b.ei() != null && this.b.ei().ai() == bnw.bw && this.b.ej() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ej();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (boo)$$0).forEach(boo::ab_);
      }

      super.c();
   }

   private List<? extends bok> i() {
      double $$0 = this.b.g(bpp.i);
      enu $$1 = enu.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends bok>)this.b.getClass(), $$1, bnv.f);
   }
}
