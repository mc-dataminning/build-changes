import com.mojang.serialization.MapCodec;

public class cuo extends cup {
   public static final MapCodec<cuo> a = b(cuo::new);
   protected static final float b = 6.0F;
   protected static final eks c = cvf.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cuo> a() {
      return a;
   }

   protected cuo(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }
}
