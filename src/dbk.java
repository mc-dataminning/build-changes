public abstract class dbk extends dar implements das {
   public static float a = 0.5F;

   public dbk(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      if ($$0 instanceof ars $$4) {
         css.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awz.c.b(this));
      $$3.a(1, $$1);
      return bur.a;
   }

   protected abstract csh a(ars var1, bxu var2, czy var3);

   protected abstract csh a(djx var1, jp var2, czy var3);

   @Override
   public css a(djx $$0, jp $$1, czy $$2, jb $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public das.a a() {
      return das.a.a().a(das.a.a.c() * 0.5F).b(das.a.a.d() * 1.25F).a();
   }
}
