import com.mojang.serialization.MapCodec;

public class dgv extends dgw {
   public static final MapCodec<dgv> a = b(dgv::new);
   protected static final float b = 6.0F;
   protected static final ezq c = dhm.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   protected dgv(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }
}
