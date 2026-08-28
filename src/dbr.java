public class dbr extends czw implements dau {
   public static float a = 1.5F;

   public dbr(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      if ($$0 instanceof aru $$4) {
         csu.a(($$2x, $$3x, $$4x) -> new ctn($$1, $$0, $$1.dt().a(), $$1.bD().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.Dv, aws.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      $$1.b(axb.c.b(this));
      $$3.a(1, $$1);
      return but.a;
   }

   @Override
   public csu a(djz $$0, jq $$1, daa $$2, jc $$3) {
      azz $$4 = $$0.G_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ffs $$8 = new ffs($$5, $$6, $$7);
      ctn $$9 = new ctn($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(csu $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public dau.a a() {
      return dau.a.a().a(($$0, $$1) -> dpk.a($$0, 1.0, ffs.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
