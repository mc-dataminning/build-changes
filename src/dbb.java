import com.mojang.serialization.MapCodec;

public class dbb extends dby implements dcb {
   public static final MapCodec<dbb> a = b(dbb::new);
   protected static final float b = 4.0F;
   protected static final est c = dby.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   public dbb(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      esa $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.d()).a(avc.au);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         return dca.a.n();
      } else {
         if ($$1 == ih.b && $$2.a(dca.mZ)) {
            $$3.a($$4, dca.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(crm.dQ);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(doz $$0, cjt $$1, cyd $$2, ib $$3) {
      return $$1.eU().f() instanceof cst ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cyx $$0, ib $$1) {
      $$0.a($$1.c(), dca.mZ.n().a(dbc.i, dpl.b), 3);
   }
}
