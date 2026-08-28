import com.mojang.serialization.MapCodec;

public class dhl extends dis implements dim {
   public static final MapCodec<dhl> a = b(dhl::new);
   private static final fal b = fai.a(dij.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dij.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   protected dhl(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(dil.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      dvd.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
