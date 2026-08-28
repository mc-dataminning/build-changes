public class cya extends cyo implements czm {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cya(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      if ($$1 instanceof aro $$2) {
         cys $$3 = $$0.n();
         fdw $$4 = $$0.l();
         ja $$5 = $$0.k();
         crm.a(new crh($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bty.a;
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      if ($$1.fI()) {
         cys $$3 = $$1.b($$2);
         if ($$0 instanceof aro $$4) {
            crm.a(new crh($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awv.c.b(this));
         }

         return bty.a;
      } else {
         return bty.e;
      }
   }

   @Override
   public crm a(dip $$0, jo $$1, cys $$2, ja $$3) {
      return new crh($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public czm.a a() {
      return czm.a.a().a(cya::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fdw a(ld $$0, ja $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
