import com.mojang.serialization.MapCodec;

public class dmy extends dez {
   public static final MapCodec<dmy> a = b(dmy::new);
   private static final double b = 5.0;
   private static final ewk c = dez.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   protected dmy(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.a;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Override
   protected float d(dsc $$0, dbe $$1, iz $$2) {
      return 1.0F;
   }
}
