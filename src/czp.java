public class czp extends cxu implements cys {
   public static float a = 1.5F;

   public czp(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      if ($$0 instanceof arn $$4) {
         crb.a(($$2x, $$3x, $$4x) -> new crt($$1, $$0, $$1.dt().a(), $$1.bE().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awk.Dp, awl.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      $$1.b(awu.c.b(this));
      $$3.a(1, $$1);
      return btq.a;
   }

   @Override
   public crb a(dhp $$0, kc $$1, cxy $$2, jo $$3) {
      azs $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fcu $$8 = new fcu($$5, $$6, $$7);
      crt $$9 = new crt($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(crb $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cys.a b() {
      return cys.a.a().a(($$0, $$1) -> dna.a($$0, 1.0, fcu.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
