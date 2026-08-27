import com.mojang.serialization.MapCodec;

public class dcj extends cwi {
   public static final MapCodec<dcj> a = b(dcj::new);
   protected static final float b = 6.0F;
   protected static final elu c = cvz.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   protected dcj(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(arr.aK) || $$0.a(cwb.dX) || super.b($$0, $$1, $$2);
   }
}
