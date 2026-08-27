import com.mojang.serialization.MapCodec;

public class dgq extends cys {
   public static final MapCodec<dgq> a = b(dgq::new);
   private static final double b = 5.0;
   private static final eos c = cys.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   protected dgq(dli.d $$0) {
      super($$0);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.a;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected float d(dlj $$0, cux $$1, hz $$2) {
      return 1.0F;
   }
}
