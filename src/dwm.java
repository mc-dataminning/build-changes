import com.mojang.serialization.MapCodec;

public class dwm extends dqx {
   public static final MapCodec<dwm> c = b(dwm::new);
   private static final fgm g = dne.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dwm> a() {
      return c;
   }

   public dwm(ebf.d $$0) {
      super($$0, jc.b, g, false, 0.1);
   }

   @Override
   protected int a(azz $$0) {
      return dsr.a($$0);
   }

   @Override
   protected dne b() {
      return dng.pi;
   }

   @Override
   protected boolean h(ebg $$0) {
      return dsr.a($$0);
   }
}
