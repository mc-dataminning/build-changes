import com.mojang.serialization.MapCodec;

public class dlc extends dvj implements dmd {
   public static final MapCodec<dlc> a = b(dlc::new);
   private static final ffc b = fez.a(dma.b(16.0, 8.0, 16.0), dma.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   protected dlc(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(dmc.ef) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      dzn.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
