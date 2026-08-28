import com.mojang.serialization.MapCodec;

public class dkg extends dfk {
   public static final MapCodec<dkg> a = b(dkg::new);
   protected static final ewm b = dfb.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfd.dX) || super.b($$0, $$1, $$2);
   }
}
