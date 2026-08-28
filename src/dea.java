import com.mojang.serialization.MapCodec;

public class dea extends dex implements dfa {
   public static final MapCodec<dea> a = b(dea::new);
   protected static final float b = 4.0F;
   protected static final ewi c = dex.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dea(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      evp $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awo.au);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dez.a.o();
      } else {
         if ($$1 == je.b && $$2.a(dez.mZ)) {
            $$3.a($$4, dez.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun(cuq.dR);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dsa $$0, cmv $$1, dbc $$2, iz $$3) {
      return $$1.eX().g() instanceof cwa ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dbw $$0, iz $$1) {
      $$0.a($$1.c(), dez.mZ.o().a(deb.i, dsm.b), 3);
   }
}
