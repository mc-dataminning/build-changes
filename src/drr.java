import com.mojang.serialization.MapCodec;

public class drr extends dvr {
   public static final MapCodec<drr> a = b(drr::new);
   private static final ffk b = dmf.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<drr> a() {
      return a;
   }

   public drr(eag.d $$0) {
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
