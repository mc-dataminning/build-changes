import com.mojang.serialization.MapCodec;

public class dbd extends cwi {
   public static final MapCodec<dbd> a = b(dbd::new);
   protected static final elu b = cvz.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public dbd(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(arr.aK) || $$0.a(cwb.dX) || super.b($$0, $$1, $$2);
   }
}
