import com.mojang.serialization.MapCodec;

public class dxj extends dqx {
   public static final MapCodec<dxj> c = b(dxj::new);
   private static final fgm g = dne.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dxj> a() {
      return c;
   }

   public dxj(ebf.d $$0) {
      super($$0, jc.a, g, false, 0.1);
   }

   @Override
   protected int a(azz $$0) {
      return dsr.a($$0);
   }

   @Override
   protected dne b() {
      return dng.pg;
   }

   @Override
   protected boolean h(ebg $$0) {
      return dsr.a($$0);
   }
}
