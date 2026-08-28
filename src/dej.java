import com.mojang.serialization.MapCodec;

public class dej extends dek {
   public static final MapCodec<dej> a = b(dej::new);
   protected static final float b = 6.0F;
   protected static final ewl c = dfa.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   protected dej(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }
}
