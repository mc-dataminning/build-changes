import com.mojang.serialization.MapCodec;

public class dlt extends dwd implements dmu {
   public static final MapCodec<dlt> a = b(dlt::new);
   private static final ffw b = fft.a(dmr.b(16.0, 8.0, 16.0), dmr.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   protected dlt(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(dmt.ei) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      eah.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
