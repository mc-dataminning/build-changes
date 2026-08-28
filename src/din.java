import com.mojang.serialization.MapCodec;

public class din extends djv implements djo {
   public static final MapCodec<din> a = b(din::new);
   private static final fbt b = fbq.a(djl.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), djl.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<din> a() {
      return a;
   }

   protected din(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(djn.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      dwl.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
