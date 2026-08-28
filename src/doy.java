import com.mojang.serialization.MapCodec;

public class doy extends dkd {
   public static final MapCodec<doy> a = b(doy::new);
   private static final int b = 20;

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   public doy(dxn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvb $$3) {
      if (!$$3.ce() && $$3 instanceof bvx) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
