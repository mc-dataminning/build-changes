import com.mojang.serialization.MapCodec;

public class dtn extends dos implements dmi {
   public static final MapCodec<dtn> b = b(dtn::new);
   private static final ffk c = dmf.b(12.0, 0.0, 10.0);

   @Override
   public MapCodec<dtn> a() {
      return b;
   }

   protected dtn(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return true;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      $$0.b($$2, dmh.bF.m());
   }
}
