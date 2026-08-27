import com.mojang.serialization.MapCodec;

public class ddw extends cyu {
   public static final MapCodec<ddw> c = b(ddw::new);
   public static final eks g = cvf.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<ddw> a() {
      return c;
   }

   public ddw(dhm.d $$0) {
      super($$0, ib.b, g, false, 0.1);
   }

   @Override
   protected int a(atw $$0) {
      return dak.a($$0);
   }

   @Override
   protected cvf b() {
      return cvh.oC;
   }

   @Override
   protected boolean g(dhn $$0) {
      return dak.a($$0);
   }
}
