public abstract class daz extends dag implements dah {
   public static float a = 0.5F;

   public daz(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      if ($$0 instanceof arq $$4) {
         csh.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bug.a;
   }

   protected abstract crw a(arq var1, bxj var2, czn var3);

   protected abstract crw a(djm var1, jp var2, czn var3);

   @Override
   public csh a(djm $$0, jp $$1, czn $$2, jb $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public dah.a a() {
      return dah.a.a().a(dah.a.a.c() * 0.5F).b(dah.a.a.d() * 1.25F).a();
   }
}
