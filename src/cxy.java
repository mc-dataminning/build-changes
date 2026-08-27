import com.mojang.serialization.MapCodec;

public class cxy extends cwi {
   public static final MapCodec<cxy> a = b(cxy::new);
   protected static final float b = 6.0F;
   protected static final elu c = cvz.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cxy> a() {
      return a;
   }

   protected cxy(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(arr.cd);
   }
}
