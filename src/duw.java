import com.mojang.serialization.MapCodec;

public class duw extends dpl {
   public static final MapCodec<duw> c = b(duw::new);
   private static final feq g = dlu.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<duw> a() {
      return c;
   }

   public duw(dzn.d $$0) {
      super($$0, ja.b, g, false, 0.1);
   }

   @Override
   protected int a(azt $$0) {
      return drf.a($$0);
   }

   @Override
   protected dlu b() {
      return dlw.pe;
   }

   @Override
   protected boolean h(dzo $$0) {
      return drf.a($$0);
   }
}
