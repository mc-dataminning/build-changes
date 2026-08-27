import com.mojang.serialization.MapCodec;

public class cvw extends cvf {
   public static final MapCodec<cvw> a = b(cvw::new);
   protected static final eks b = cvf.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends cvw> a() {
      return a;
   }

   public cvw(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return !$$1.t($$2.d());
   }
}
