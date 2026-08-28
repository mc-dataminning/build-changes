import com.mojang.serialization.MapCodec;

public class dsx extends dvr {
   public static final MapCodec<dsx> a = b(dsx::new);
   private static final ffk b = dmf.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   protected dsx(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(axc.aO) || $$0.a(dmh.eo) || super.b($$0, $$1, $$2);
   }
}
