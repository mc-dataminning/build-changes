public class dbf extends czw implements dau {
   public static float a = 1.5F;

   public dbf(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.zE, aws.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      if ($$0 instanceof aru $$4) {
         csu.a(csz::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(axb.c.b(this));
      $$3.a(1, $$1);
      return but.a;
   }

   @Override
   public csu a(djz $$0, jq $$1, daa $$2, jc $$3) {
      return new csz($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
