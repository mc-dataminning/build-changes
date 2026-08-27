import com.mojang.serialization.MapCodec;

public class daz extends ctc {
   public static final MapCodec<daz> a = b(daz::new);
   private static final double b = 5.0;
   private static final eia c = ctc.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<daz> a() {
      return a;
   }

   protected daz(dfc.d $$0) {
      super($$0);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.a;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public float b(dfd $$0, cph $$1, gw $$2) {
      return 1.0F;
   }
}
