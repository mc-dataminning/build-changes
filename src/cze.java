public class cze extends csy implements css {
   public static final dge d = dfu.aU;
   protected static final float e = 6.0F;
   protected static final eib f = csq.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final dek a;

   protected cze(dek $$0, dfd.d $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return f;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(akn $$0, gw $$1, dfe $$2, arx $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return true;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d);
   }
}
