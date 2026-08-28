import com.mojang.serialization.MapCodec;

public class dln extends dlp {
   public static final MapCodec<dln> a = b(dln::new);
   private static final ffk c = dmf.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dln> a() {
      return a;
   }

   protected dln(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }
}
