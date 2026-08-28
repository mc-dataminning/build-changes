import com.mojang.serialization.MapCodec;

public class dkv extends dkd {
   public static final MapCodec<dkv> a = b(dkv::new);
   protected static final fcl b = dkd.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dkv> a() {
      return a;
   }

   public dkv(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return !$$1.u($$2.e());
   }
}
