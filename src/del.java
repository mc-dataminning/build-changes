import com.mojang.serialization.MapCodec;

public class del extends dfi implements dfl {
   public static final MapCodec<del> a = b(del::new);
   protected static final float b = 4.0F;
   protected static final exa c = dfi.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public del(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      ewh $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.d()).a(avw.au);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfk.a.o();
      } else {
         if ($$1 == jf.b && $$2.a(dfk.mZ)) {
            $$3.a($$4, dfk.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(cug.dR);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dsl $$0, cml $$1, dbm $$2, ja $$3) {
      return $$1.eV().g() instanceof cvq ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dcg $$0, ja $$1) {
      $$0.a($$1.c(), dfk.mZ.o().a(dem.i, dsx.b), 3);
   }
}
