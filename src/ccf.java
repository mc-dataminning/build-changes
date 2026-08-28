public class ccf extends cbc {
   private final bun a;

   public ccf(bun $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dS().S() && this.a.a(btr.f).f() && cfa.a(this.a);
   }

   @Override
   public void d() {
      ((cdp)this.a.P()).d(true);
   }

   @Override
   public void e() {
      if (cfa.a(this.a)) {
         ((cdp)this.a.P()).d(false);
      }
   }
}
