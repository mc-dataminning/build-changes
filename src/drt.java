import com.mojang.serialization.MapCodec;

public class drt extends djq {
   public static final MapCodec<drt> c = b(drt::new);

   @Override
   public MapCodec<drt> a() {
      return c;
   }

   public drt(dxn.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dkf.a.m();
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dxo $$0) {
      return $$0.a(axk.aV);
   }

   @Override
   protected boolean g(dxo $$0) {
      return true;
   }
}
