import com.mojang.serialization.MapCodec;

public class ddx extends deu implements dex {
   public static final MapCodec<ddx> a = b(ddx::new);
   protected static final float b = 4.0F;
   protected static final ewf c = deu.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public ddx(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      evm $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awl.au);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dew.a.n();
      } else {
         if ($$1 == je.b && $$2.a(dew.mZ)) {
            $$3.a($$4, dew.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(cun.dR);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(drx $$0, cms $$1, daz $$2, iz $$3) {
      return $$1.eX().g() instanceof cvx ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dbt $$0, iz $$1) {
      $$0.a($$1.c(), dew.mZ.n().a(ddy.i, dsj.b), 3);
   }
}
