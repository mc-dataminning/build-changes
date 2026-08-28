public abstract class dak extends czr implements czs {
   public static float a = 0.5F;

   public dak(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      if ($$0 instanceof arq $$4) {
         crs.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bub.a;
   }

   protected abstract crh a(arq var1, bxc var2, cyy var3);

   protected abstract crh a(div var1, jo var2, cyy var3);

   @Override
   public crs a(div $$0, jo $$1, cyy $$2, ja $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public czs.a a() {
      return czs.a.a().a(czs.a.a.c() * 0.5F).b(czs.a.a.d() * 1.25F).a();
   }
}
