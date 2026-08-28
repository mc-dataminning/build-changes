import com.mojang.serialization.MapCodec;

public class dek extends dfh implements dfk {
   public static final MapCodec<dek> a = b(dek::new);
   protected static final float b = 4.0F;
   protected static final ewy c = dfh.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   public dek(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      ewf $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.d()).a(avw.au);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfj.a.o();
      } else {
         if ($$1 == jf.b && $$2.a(dfj.mZ)) {
            $$3.a($$4, dfj.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(cuf.dR);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dsk $$0, cmk $$1, dbl $$2, ja $$3) {
      return $$1.eU().g() instanceof cvp ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dcf $$0, ja $$1) {
      $$0.a($$1.c(), dfj.mZ.o().a(del.i, dsw.b), 3);
   }
}
