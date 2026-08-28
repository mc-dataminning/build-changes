import com.mojang.serialization.MapCodec;

public class dtc extends dlp {
   public static final MapCodec<dtc> n = b(dtc::new);

   @Override
   public MapCodec<dtc> a() {
      return n;
   }

   public dtc(dxt.d $$0) {
      super(() -> duy.c, $$0);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dws($$0, $$1);
   }

   @Override
   protected axm<alz> c() {
      return axp.i.b(axp.ai);
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return bae.a(dvd.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
