public abstract class dbm extends dat implements dau {
   public static float a = 0.5F;

   public dbm(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      if ($$0 instanceof aru $$4) {
         csu.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(axb.c.b(this));
      $$3.a(1, $$1);
      return but.a;
   }

   protected abstract csj a(aru var1, bxw var2, daa var3);

   protected abstract csj a(djz var1, jq var2, daa var3);

   @Override
   public csu a(djz $$0, jq $$1, daa $$2, jc $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public dau.a a() {
      return dau.a.a().a(dau.a.a.c() * 0.5F).b(dau.a.a.d() * 1.25F).a();
   }
}
