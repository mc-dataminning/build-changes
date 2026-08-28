import com.mojang.serialization.MapCodec;

public class dhg extends dfq {
   public static final MapCodec<dhg> a = b(dhg::new);
   protected static final float b = 6.0F;
   protected static final ewy c = dfh.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(avw.cl);
   }
}
