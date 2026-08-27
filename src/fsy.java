public class fsy extends fui<byt, few<byt>> {
   private static final aeu a = new aeu("textures/entity/enderman/enderman.png");
   private final arx i = arx.a();

   public fsy(ftc.a $$0) {
      super($$0, new few<>($$0.a(fhw.R)), 0.5F);
      this.a(new fwu<>(this));
      this.a(new fwl(this, $$0.c()));
   }

   public void a(byt $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      dfe $$6 = $$0.ga();
      few<byt> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gb();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehi a(byt $$0, float $$1) {
      if ($$0.gb()) {
         double $$2 = 0.02;
         return new ehi(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aeu a(byt $$0) {
      return a;
   }
}
