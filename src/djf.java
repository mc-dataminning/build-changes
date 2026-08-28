import com.mojang.serialization.MapCodec;

public class djf extends dkn implements dkg {
   public static final MapCodec<djf> a = b(djf::new);
   private static final fcl b = fci.a(dkd.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dkd.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   protected djf(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(dkf.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      dxd.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
