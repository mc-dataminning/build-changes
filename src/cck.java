public class cck extends cbh {
   private final bus a;

   public cck(bus $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dS().S() && this.a.a(btw.f).f() && cff.a(this.a);
   }

   @Override
   public void d() {
      ((cdu)this.a.P()).d(true);
   }

   @Override
   public void e() {
      if (cff.a(this.a)) {
         ((cdu)this.a.P()).d(false);
      }
   }
}
