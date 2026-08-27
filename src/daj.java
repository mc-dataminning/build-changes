import com.mojang.serialization.MapCodec;

public class daj extends cvo {
   public static final MapCodec<daj> a = b(daj::new);
   protected static final eks b = cvf.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   public daj(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(ark.aK) || $$0.a(cvh.dX) || super.b($$0, $$1, $$2);
   }
}
