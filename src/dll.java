import com.mojang.serialization.MapCodec;

public class dll extends dfj {
   public static final MapCodec<dll> a = b(dll::new);
   protected static final float b = 6.0F;
   protected static final ewl c = dfa.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   protected dll(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfc.dX) || super.b($$0, $$1, $$2);
   }
}
