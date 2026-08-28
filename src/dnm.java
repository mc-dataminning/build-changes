import com.mojang.serialization.MapCodec;

public class dnm extends dfq implements dfk {
   public static final MapCodec<dnm> a = b(dnm::new);
   protected static final float b = 6.0F;
   protected static final ewy c = dfh.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   protected dnm(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return true;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      dhp $$4 = (dhp)($$3.a(dfj.bu) ? dfj.iI : dfj.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhp.a($$0, $$4.o(), $$2, 2);
      }
   }
}
