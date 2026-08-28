import com.mojang.serialization.MapCodec;

public class drp extends djl {
   public static final MapCodec<drp> a = b(drp::new);
   private static final double b = 5.0;
   private static final fbt c = djl.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   protected drp(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected dpw a_(dww $$0) {
      return dpw.a;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected float c(dww $$0, dfm $$1, ji $$2) {
      return 1.0F;
   }
}
