import com.mojang.serialization.MapCodec;

public class ddj extends cvo implements cvi {
   public static final MapCodec<ddj> a = b(ddj::new);
   protected static final float b = 6.0F;
   protected static final eks c = cvf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   protected ddj(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      cxn $$4 = (cxn)($$3.a(cvh.bu) ? cvh.iI : cvh.iH);
      if ($$4.o().a($$0, $$2) && $$0.t($$2.c())) {
         cxn.a($$0, $$4.o(), $$2, 2);
      }
   }
}
