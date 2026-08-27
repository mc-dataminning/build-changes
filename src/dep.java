import com.mojang.serialization.MapCodec;

public class dep extends cyu {
   public static final MapCodec<dep> c = b(dep::new);
   protected static final eks g = cvf.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dep> a() {
      return c;
   }

   public dep(dhm.d $$0) {
      super($$0, ib.a, g, false, 0.1);
   }

   @Override
   protected int a(atw $$0) {
      return dak.a($$0);
   }

   @Override
   protected cvf b() {
      return cvh.oA;
   }

   @Override
   protected boolean g(dhn $$0) {
      return dak.a($$0);
   }
}
