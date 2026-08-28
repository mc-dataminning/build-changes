import com.mojang.serialization.MapCodec;

public class dgz extends dfj {
   public static final MapCodec<dgz> a = b(dgz::new);
   protected static final float b = 6.0F;
   protected static final ewl c = dfa.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   protected dgz(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(awp.cl);
   }
}
