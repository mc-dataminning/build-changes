import com.mojang.serialization.MapCodec;

public class deq extends der {
   public static final MapCodec<deq> a = b(deq::new);
   protected static final float b = 6.0F;
   protected static final ewy c = dfh.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   protected deq(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }
}
