import com.mojang.serialization.MapCodec;

public class dee extends dfb implements dfe {
   public static final MapCodec<dee> a = b(dee::new);
   protected static final float b = 4.0F;
   protected static final ewm c = dfb.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      evt $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awp.au);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfd.a.o();
      } else {
         if ($$1 == je.b && $$2.a(dfd.mZ)) {
            $$3.a($$4, dfd.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(cuu.dR);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dse $$0, cmz $$1, dbg $$2, iz $$3) {
      return $$1.eX().g() instanceof cwe ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dca $$0, iz $$1) {
      $$0.a($$1.c(), dfd.mZ.o().a(def.i, dsq.b), 3);
   }
}
