import com.mojang.serialization.MapCodec;

public class dkp extends diz {
   public static final MapCodec<dkp> a = b(dkp::new);
   protected static final float b = 6.0F;
   protected static final fas c = diq.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(axc.cn);
   }
}
