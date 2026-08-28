import com.mojang.serialization.MapCodec;

public class dvs extends dpl {
   public static final MapCodec<dvs> c = b(dvs::new);
   private static final feq g = dlu.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dvs> a() {
      return c;
   }

   public dvs(dzn.d $$0) {
      super($$0, ja.a, g, false, 0.1);
   }

   @Override
   protected int a(azt $$0) {
      return drf.a($$0);
   }

   @Override
   protected dlu b() {
      return dlw.pc;
   }

   @Override
   protected boolean h(dzo $$0) {
      return drf.a($$0);
   }
}
