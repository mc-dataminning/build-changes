import com.mojang.serialization.MapCodec;

public class ddh extends ddi {
   public static final MapCodec<ddh> a = b(ddh::new);
   protected static final float b = 6.0F;
   protected static final evd c = ddy.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   protected ddh(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }
}
