import com.mojang.serialization.MapCodec;

public class dnm extends dhn {
   public static final MapCodec<dnm> c = b(dnm::new);
   protected static final evd g = ddy.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dnm> a() {
      return c;
   }

   public dnm(dra.d $$0) {
      super($$0, it.a, g, false, 0.1);
   }

   @Override
   protected int a(ayk $$0) {
      return dje.a($$0);
   }

   @Override
   protected ddy b() {
      return dea.oA;
   }

   @Override
   protected boolean g(drb $$0) {
      return dje.a($$0);
   }
}
