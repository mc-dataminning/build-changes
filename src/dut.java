import com.mojang.serialization.MapCodec;

public class dut extends dos implements dmi {
   public static final MapCodec<dut> b = b(dut::new);
   private static final ffk c = dmf.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dut> a() {
      return b;
   }

   protected dut(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return dmi.a_($$0, $$1, dmh.bE.m());
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      dmi.a((dja)$$0, $$2, dmh.bE.m()).ifPresent($$1x -> $$0.b($$1x, dmh.bE.m()));
   }
}
