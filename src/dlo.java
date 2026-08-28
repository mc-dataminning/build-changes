import com.mojang.serialization.MapCodec;

public class dlo extends dlp {
   public static final MapCodec<dlo> a = b(dlo::new);
   private static final ffk c = dmf.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }
}
