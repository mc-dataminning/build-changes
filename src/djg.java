import com.mojang.serialization.MapCodec;

public class djg extends dko implements dkh {
   public static final MapCodec<djg> a = b(djg::new);
   private static final fcr b = fco.a(dke.b(16.0, 8.0, 16.0), dke.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   protected djg(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(dkg.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      dxf.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
