import com.mojang.serialization.MapCodec;

public class dgk extends dan {
   public static final MapCodec<dgk> c = b(dgk::new);
   protected static final emv g = cwy.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dgk> a() {
      return c;
   }

   public dgk(djo.d $$0) {
      super($$0, ic.a, g, false, 0.1);
   }

   @Override
   protected int a(auw $$0) {
      return dcd.a($$0);
   }

   @Override
   protected cwy b() {
      return cxa.oA;
   }

   @Override
   protected boolean g(djp $$0) {
      return dcd.a($$0);
   }
}
