import com.mojang.serialization.MapCodec;

public class dny extends dhv {
   public static final MapCodec<dny> a = b(dny::new);
   protected static final float b = 6.0F;
   protected static final ezq c = dhm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   protected dny(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(awv.aM) || $$0.a(dho.dX) || super.b($$0, $$1, $$2);
   }
}
