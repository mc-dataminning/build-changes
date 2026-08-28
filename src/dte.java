import com.mojang.serialization.MapCodec;

public class dte extends dnb {
   public static final MapCodec<dte> c = b(dte::new);
   protected static final fbt g = djl.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dte> a() {
      return c;
   }

   public dte(dwv.d $$0) {
      super($$0, jn.a, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dou.a($$0);
   }

   @Override
   protected djl b() {
      return djn.pc;
   }

   @Override
   protected boolean h(dww $$0) {
      return dou.a($$0);
   }
}
