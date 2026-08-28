import com.mojang.serialization.MapCodec;

public class dsn extends dkn implements dkg {
   public static final MapCodec<dsn> a = b(dsn::new);
   protected static final float b = 6.0F;
   protected static final fcl c = dkd.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   protected dsn(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      dmm.a($$0, o($$3).m(), $$2, 2);
   }

   private static dmm o(dxo $$0) {
      return (dmm)($$0.a(dkf.bB) ? dkf.jg : dkf.jf);
   }
}
