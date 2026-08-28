import com.mojang.serialization.MapCodec;

public class dru extends dkd {
   public static final MapCodec<dru> a = b(dru::new);
   protected static final fcl b = dkd.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dru> a() {
      return a;
   }

   public dru(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      return fci.b();
   }

   @Override
   protected fcl c(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.b();
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      dkk.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == jm.b && $$6.a(dkf.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected float c(dxo $$0, dge $$1, jh $$2) {
      return 0.2F;
   }
}
