import com.mojang.serialization.MapCodec;

public class dhv extends det {
   public static final MapCodec<dhv> a = b(dhv::new);
   protected static final ewy b = dfh.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(dsj.d $$0) {
      super($$0);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drh($$0, $$1);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if ($$1 instanceof aqm && $$3.cx() && ewv.c(ewv.a($$3.cL().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ewj.i)) {
         akj<dcf> $$4 = $$1.af() == dcf.j ? dcf.h : dcf.j;
         aqm $$5 = ((aqm)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return cuc.l;
   }

   @Override
   protected boolean a(dsk $$0, eog $$1) {
      return false;
   }
}
