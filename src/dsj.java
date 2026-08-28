import com.mojang.serialization.MapCodec;

public class dsj extends dnb {
   public static final MapCodec<dsj> c = b(dsj::new);
   public static final fbt g = djl.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dsj> a() {
      return c;
   }

   public dsj(dwv.d $$0) {
      super($$0, jn.b, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dou.a($$0);
   }

   @Override
   protected djl b() {
      return djn.pe;
   }

   @Override
   protected boolean h(dww $$0) {
      return dou.a($$0);
   }
}
