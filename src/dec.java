import com.mojang.serialization.MapCodec;

public class dec extends dez implements dfc {
   public static final MapCodec<dec> a = b(dec::new);
   protected static final float b = 4.0F;
   protected static final ewk c = dez.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public dec(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      evr $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awp.au);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfb.a.o();
      } else {
         if ($$1 == je.b && $$2.a(dfb.mZ)) {
            $$3.a($$4, dfb.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(cus.dR);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dsc $$0, cmx $$1, dbe $$2, iz $$3) {
      return $$1.eX().g() instanceof cwc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dby $$0, iz $$1) {
      $$0.a($$1.c(), dfb.mZ.o().a(ded.i, dso.b), 3);
   }
}
