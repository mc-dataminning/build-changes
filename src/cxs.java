public class cxs extends cyo implements czm {
   public static float a = 1.5F;

   public cxs(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awl.ii, awm.h, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof aro $$4) {
         crm.a(crv::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awv.c.b(this));
      $$3.a(1, $$1);
      return bty.a;
   }

   @Override
   public crm a(dip $$0, jo $$1, cys $$2, ja $$3) {
      return new crv($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
