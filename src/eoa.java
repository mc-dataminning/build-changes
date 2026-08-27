public class eoa extends ger {
   private final eya a;
   private final eoa.a b;
   private esz c = esz.a;

   public eoa(eni $$0, eya $$1) {
      super(eqd.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoa(tf $$0, eya $$1) {
      super(eqd.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoa(tf $$0, tf $$1, eya $$2) {
      super(eqd.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static eoa.a a(eni $$0) {
      elx $$1 = $$0.a;
      return a(tf.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static eoa.a a(tf $$0) {
      return a(tf.c("mco.errorMessage.generic"), $$0);
   }

   private static eoa.a a(tf $$0, tf $$1) {
      return new eoa.a($$0, $$1);
   }

   @Override
   public void aC_() {
      this.d(esg.a(te.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = esz.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public tf e() {
      return tf.h().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -65536);
   }

   static record a(tf a, tf b) {
   }
}
