import com.mojang.serialization.MapCodec;

public class dcy extends cva {
   public static final MapCodec<dcy> a = b(dcy::new);
   private static final double b = 5.0;
   private static final ekn c = cva.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   protected dcy(dhh.d $$0) {
      super($$0);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.a;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public float d(dhi $$0, crg $$1, ht $$2) {
      return 1.0F;
   }
}
