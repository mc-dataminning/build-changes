public class fsz extends fuj<bze, few<bze>> {
   private static final aez a = new aez("textures/entity/enderman/enderman.png");
   private final ash i = ash.a();

   public fsz(ftd.a $$0) {
      super($$0, new few<>($$0.a(fhw.R)), 0.5F);
      this.a(new fwv<>(this));
      this.a(new fwm(this, $$0.c()));
   }

   public void a(bze $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      dfd $$6 = $$0.ge();
      few<bze> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehh a(bze $$0, float $$1) {
      if ($$0.gf()) {
         double $$2 = 0.02;
         return new ehh(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aez a(bze $$0) {
      return a;
   }
}
