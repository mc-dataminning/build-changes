import com.mojang.serialization.MapCodec;

public class dpl extends dkn {
   public static final MapCodec<dpl> a = b(dpl::new);
   protected static final fcl b = dkd.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   public dpl(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(axk.aO) || $$0.a(dkf.ek) || super.b($$0, $$1, $$2);
   }
}
