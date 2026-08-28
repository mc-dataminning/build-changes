public abstract class dap extends czw implements czx {
   public static float a = 0.5F;

   public dap(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      if ($$0 instanceof arq $$4) {
         crx.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bud.a;
   }

   protected abstract crm a(arq var1, bxe var2, czd var3);

   protected abstract crm a(dja var1, jo var2, czd var3);

   @Override
   public crx a(dja $$0, jo $$1, czd $$2, ja $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public czx.a a() {
      return czx.a.a().a(czx.a.a.c() * 0.5F).b(czx.a.a.d() * 1.25F).a();
   }
}
