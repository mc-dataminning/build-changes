public abstract class dae extends czl implements czm {
   public static float a = 0.5F;

   public dae(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      if ($$0 instanceof aro $$4) {
         crm.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(awv.c.b(this));
      $$3.a(1, $$1);
      return bty.a;
   }

   protected abstract crb a(aro var1, bwz var2, cys var3);

   protected abstract crb a(dip var1, jo var2, cys var3);

   @Override
   public crm a(dip $$0, jo $$1, cys $$2, ja $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public czm.a a() {
      return czm.a.a().a(czm.a.a.c() * 0.5F).b(czm.a.a.d() * 1.25F).a();
   }
}
