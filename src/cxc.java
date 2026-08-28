public class cxc extends cxu {
   public static float a = 1.5F;

   public cxc(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awk.iO, awl.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arn $$4) {
         crb.a(crl::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awu.c.b(this));
      $$3.a(1, $$1);
      return btq.a;
   }
}
