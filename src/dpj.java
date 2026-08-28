import com.mojang.serialization.MapCodec;

public class dpj extends dhj {
   public static final MapCodec<dpj> a = b(dpj::new);
   private static final double b = 5.0;
   private static final ezm c = dhj.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   protected dpj(dun.d $$0) {
      super($$0);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.a;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected float c(duo $$0, ddl $$1, je $$2) {
      return 1.0F;
   }
}
