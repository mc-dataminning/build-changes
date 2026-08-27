import com.mojang.serialization.MapCodec;

public class dbp extends cvo {
   public static final MapCodec<dbp> a = b(dbp::new);
   protected static final float b = 6.0F;
   protected static final eks c = cvf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dbp> a() {
      return a;
   }

   protected dbp(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(ark.aK) || $$0.a(cvh.dX) || super.b($$0, $$1, $$2);
   }
}
