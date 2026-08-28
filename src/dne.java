import com.mojang.serialization.MapCodec;

public class dne extends dff {
   public static final MapCodec<dne> a = b(dne::new);
   private static final double b = 5.0;
   private static final ews c = dff.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   protected dne(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.a;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected float d(dsh $$0, dbj $$1, ja $$2) {
      return 1.0F;
   }
}
