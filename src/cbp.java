public class cbp extends cam {
   private final btw a;

   public cbp(btw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dO().R() && this.a.a(bsy.f).e() && cek.a(this.a);
   }

   @Override
   public void d() {
      ((ccz)this.a.N()).d(true);
   }

   @Override
   public void e() {
      if (cek.a(this.a)) {
         ((ccz)this.a.N()).d(false);
      }
   }
}
