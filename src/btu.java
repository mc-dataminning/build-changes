public class btu extends bsr {
   private final bme a;

   public btu(bme $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().O() && this.a.c(blk.f).b() && bwo.a(this.a);
   }

   @Override
   public void c() {
      ((bve)this.a.N()).d(true);
   }

   @Override
   public void d() {
      if (bwo.a(this.a)) {
         ((bve)this.a.N()).d(false);
      }
   }
}
