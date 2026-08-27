import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czi extends cyu implements czv {
   public static final MapCodec<czi> c = b(czi::new);
   protected static final eks g = cvf.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<czi> a() {
      return c;
   }

   protected czi(dhm.d $$0) {
      super($$0, ib.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dhn $$0) {
      return $$0.a(cvh.G);
   }

   @Override
   protected cvf b() {
      return cvh.md;
   }

   @Override
   protected boolean h(dhn $$0) {
      return !$$0.a(cvh.kJ);
   }

   @Override
   public boolean a(@Nullable cdz $$0, crl $$1, hx $$2, dhn $$3, ecw $$4) {
      return false;
   }

   @Override
   public boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      return false;
   }

   @Override
   protected int a(atw $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      return $$1.a(arp.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public ecx c_(dhn $$0) {
      return ecy.c.a(false);
   }
}
