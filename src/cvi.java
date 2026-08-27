import com.mojang.serialization.MapCodec;

public class cvi extends cvj {
   public static final MapCodec<cvi> a = b(cvi::new);
   protected static final float b = 6.0F;
   protected static final elu c = cvz.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cvi> a() {
      return a;
   }

   protected cvi(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }
}
