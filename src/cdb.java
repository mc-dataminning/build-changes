public class cdb extends cby {
   private final bvi a;

   public cdb(bvi $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dX().S() && this.a.a(bum.f).f() && cfw.a(this.a);
   }

   @Override
   public void d() {
      ((cel)this.a.P()).d(true);
   }

   @Override
   public void e() {
      if (cfw.a(this.a)) {
         ((cel)this.a.P()).d(false);
      }
   }
}
