public class crn extends cst {
   private final crm a;

   public crn(bri $$0, int $$1, int $$2, int $$3, crm $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
   }

   @Override
   public boolean a(cvp $$0) {
      return !this.a.e(this.d) && super.a($$0);
   }

   @Override
   public void c() {
      super.c();
      this.a.a(this.c);
   }
}
