import com.mojang.serialization.MapCodec;

public class dnv extends dhs {
   public static final MapCodec<dnv> a = b(dnv::new);
   protected static final float b = 6.0F;
   protected static final ezm c = dhj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   protected dnv(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(awt.aM) || $$0.a(dhl.dX) || super.b($$0, $$1, $$2);
   }
}
