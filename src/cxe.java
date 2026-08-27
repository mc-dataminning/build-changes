import com.mojang.serialization.MapCodec;

public class cxe extends cvo {
   public static final MapCodec<cxe> a = b(cxe::new);
   protected static final float b = 6.0F;
   protected static final eks c = cvf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cxe> a() {
      return a;
   }

   protected cxe(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(ark.cd);
   }
}
