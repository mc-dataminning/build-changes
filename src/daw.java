public abstract class daw extends dad implements dae {
   public static float a = 0.5F;

   public daw(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      if ($$0 instanceof arq $$4) {
         cse.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bug.a;
   }

   protected abstract crt a(arq var1, bxj var2, czk var3);

   protected abstract crt a(djh var1, jp var2, czk var3);

   @Override
   public cse a(djh $$0, jp $$1, czk $$2, jb $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public dae.a a() {
      return dae.a.a().a(dae.a.a.c() * 0.5F).b(dae.a.a.d() * 1.25F).a();
   }
}
