import com.mojang.serialization.MapCodec;

public class dmr extends dhn {
   public static final MapCodec<dmr> c = b(dmr::new);
   public static final evd g = ddy.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dmr> a() {
      return c;
   }

   public dmr(dra.d $$0) {
      super($$0, it.b, g, false, 0.1);
   }

   @Override
   protected int a(ayk $$0) {
      return dje.a($$0);
   }

   @Override
   protected ddy b() {
      return dea.oC;
   }

   @Override
   protected boolean g(drb $$0) {
      return dje.a($$0);
   }
}
