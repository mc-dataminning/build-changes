import com.mojang.serialization.MapCodec;

public class dsm extends dmm implements dkg {
   public static final MapCodec<dsm> c = b(dsm::new);

   @Override
   public MapCodec<dsm> a() {
      return c;
   }

   public dsm(dxn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      a($$0, $$2, new cxg(this));
   }
}
