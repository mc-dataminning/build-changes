import com.mojang.serialization.MapCodec;

public class dkm extends dfq {
   public static final MapCodec<dkm> a = b(dkm::new);
   protected static final ewy b = dfh.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(avw.aL) || $$0.a(dfj.dX) || super.b($$0, $$1, $$2);
   }
}
