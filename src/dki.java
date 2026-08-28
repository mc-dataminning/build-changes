import com.mojang.serialization.MapCodec;

public class dki extends dis {
   public static final MapCodec<dki> a = b(dki::new);
   protected static final float b = 6.0F;
   protected static final fal c = dij.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   protected dki(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(axd.cn);
   }
}
