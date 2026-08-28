public class eqb implements eqc {
   private final dcu b;

   public eqb(dcu $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ji $$0, dta $$1, jd $$2, jd $$3, int $$4, int $$5) {
      eqc.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(jd $$0, dfw $$1, jd $$2) {
      dta $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dta $$0, jd $$1, dfw $$2, jd $$3, boolean $$4) {
      eqc.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
