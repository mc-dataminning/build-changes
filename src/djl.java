import com.mojang.serialization.MapCodec;

public class djl extends dhv {
   public static final MapCodec<djl> a = b(djl::new);
   protected static final float b = 6.0F;
   protected static final ezq c = dhm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(awv.cm);
   }
}
