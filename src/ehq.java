public class ehq implements ehr {
   private final cvn b;

   public ehq(cvn $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ie $$0, dlf $$1, hz $$2, hz $$3, int $$4, int $$5) {
      ehr.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(hz $$0, cyo $$1, hz $$2) {
      dlf $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dlf $$0, hz $$1, cyo $$2, hz $$3, boolean $$4) {
      ehr.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
