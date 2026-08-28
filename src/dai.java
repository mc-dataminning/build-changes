public class dai extends cyz implements czx {
   public static float a = 1.5F;

   public dai(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.zE, awo.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arq $$4) {
         crx.a(csc::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bud.a;
   }

   @Override
   public crx a(dja $$0, jo $$1, czd $$2, ja $$3) {
      return new csc($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
