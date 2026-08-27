import com.mojang.serialization.MapCodec;

public class dcq extends cvf {
   public static final MapCodec<dcq> a = b(dcq::new);
   protected static final eks b = cvf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public dcq(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      return ekp.b();
   }

   @Override
   public eks c(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ekp.b();
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      cvl.b($$1, $$2.c(), $$0);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.b && $$2.a(cvh.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public float d(dhn $$0, crl $$1, hx $$2) {
      return 0.2F;
   }
}
