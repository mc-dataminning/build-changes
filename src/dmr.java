import com.mojang.serialization.MapCodec;

public class dmr extends dhv {
   public static final MapCodec<dmr> a = b(dmr::new);
   protected static final ezq b = dhm.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(awv.aM) || $$0.a(dho.dX) || super.b($$0, $$1, $$2);
   }
}
