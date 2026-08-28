import com.mojang.serialization.MapCodec;

public class dll extends djv {
   public static final MapCodec<dll> a = b(dll::new);
   protected static final float b = 6.0F;
   protected static final fbt c = djl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   protected dll(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(awp.co);
   }
}
