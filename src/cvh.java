import com.mojang.serialization.MapCodec;

public class cvh extends cvj {
   public static final MapCodec<cvh> a = b(cvh::new);
   private static final elu b = cvz.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cvh> a() {
      return a;
   }

   protected cvh(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }
}
