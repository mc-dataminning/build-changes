import com.mojang.serialization.MapCodec;

public class don extends dim {
   public static final MapCodec<don> c = b(don::new);
   public static final ewj e = dey.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<don> a() {
      return c;
   }

   public don(dsa.d $$0) {
      super($$0, je.a, e, false);
   }

   @Override
   protected din c() {
      return (din)dfa.oz;
   }
}
