import com.mojang.serialization.MapCodec;

public class dpx extends dhy {
   public static final MapCodec<dpx> a = b(dpx::new);
   private static final double b = 5.0;
   private static final fab c = dhy.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   protected dpx(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.a;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected float c(dvd $$0, dea $$1, jg $$2) {
      return 1.0F;
   }
}
