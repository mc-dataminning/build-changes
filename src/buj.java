public class buj extends btg {
   private final bmt a;

   public buj(bmt $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().P() && this.a.c(blz.f).b() && bxd.a(this.a);
   }

   @Override
   public void c() {
      ((bvt)this.a.N()).d(true);
   }

   @Override
   public void d() {
      if (bxd.a(this.a)) {
         ((bvt)this.a.N()).d(false);
      }
   }
}
