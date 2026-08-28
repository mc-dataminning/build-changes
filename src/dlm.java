import com.mojang.serialization.MapCodec;

public class dlm extends dfk {
   public static final MapCodec<dlm> a = b(dlm::new);
   protected static final float b = 6.0F;
   protected static final ewm c = dfb.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfd.dX) || super.b($$0, $$1, $$2);
   }
}
