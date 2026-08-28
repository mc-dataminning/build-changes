import com.mojang.serialization.MapCodec;

public class dmt extends dfh {
   public static final MapCodec<dmt> a = b(dmt::new);
   protected static final ewy b = dfh.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      return ewv.b();
   }

   @Override
   protected ewy c(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.b();
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      dfn.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && $$2.a(dfj.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected float d(dsk $$0, dbl $$1, ja $$2) {
      return 0.2F;
   }
}
