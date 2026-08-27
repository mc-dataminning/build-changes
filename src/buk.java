public class buk extends bth {
   private final bmu a;

   public buk(bmu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().P() && this.a.c(bma.f).b() && bxe.a(this.a);
   }

   @Override
   public void c() {
      ((bvu)this.a.N()).d(true);
   }

   @Override
   public void d() {
      if (bxe.a(this.a)) {
         ((bvu)this.a.N()).d(false);
      }
   }
}
