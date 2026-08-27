import com.mojang.serialization.MapCodec;

public class dll extends dfn {
   public static final MapCodec<dll> c = b(dll::new);
   protected static final est g = dby.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dll> a() {
      return c;
   }

   public dll(doy.d $$0) {
      super($$0, ih.a, g, false, 0.1);
   }

   @Override
   protected int a(axr $$0) {
      return dhd.a($$0);
   }

   @Override
   protected dby b() {
      return dca.oA;
   }

   @Override
   protected boolean g(doz $$0) {
      return dhd.a($$0);
   }
}
