public class dbd extends czu implements das {
   public static float a = 1.5F;

   public dbd(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awp.zE, awq.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ars $$4) {
         css.a(csx::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awz.c.b(this));
      $$3.a(1, $$1);
      return bur.a;
   }

   @Override
   public css a(djx $$0, jp $$1, czy $$2, jb $$3) {
      return new csx($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
