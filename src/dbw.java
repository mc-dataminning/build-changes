public abstract class dbw extends dbd implements dbe {
   public static float a = 0.5F;

   public dbw(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      if ($$0 instanceof asb $$4) {
         ctd.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(axi.c.b(this));
      $$3.a(1, $$1);
      return bvc.a;
   }

   protected abstract css a(asb var1, byf var2, dak var3);

   protected abstract css a(dkj var1, jq var2, dak var3);

   @Override
   public ctd a(dkj $$0, jq $$1, dak $$2, jc $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public dbe.a a() {
      return dbe.a.a().a(dbe.a.a.c() * 0.5F).b(dbe.a.a.d() * 1.25F).a();
   }
}
