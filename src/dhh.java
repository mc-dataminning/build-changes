import com.mojang.serialization.MapCodec;

public class dhh extends dhi {
   public static final MapCodec<dhh> a = b(dhh::new);
   protected static final float b = 6.0F;
   protected static final fab c = dhy.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }
}
