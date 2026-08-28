import com.mojang.serialization.MapCodec;

public class dlj extends dfh {
   public static final MapCodec<dlj> a = b(dlj::new);
   protected static final float b = 6.0F;
   protected static final ewj c = dey.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(awo.aL) || $$0.a(dfa.dX) || super.b($$0, $$1, $$2);
   }
}
