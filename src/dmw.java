import com.mojang.serialization.MapCodec;

public class dmw extends dex {
   public static final MapCodec<dmw> a = b(dmw::new);
   private static final double b = 5.0;
   private static final ewi c = dex.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   protected dmw(drz.d $$0) {
      super($$0);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.a;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected float d(dsa $$0, dbc $$1, iz $$2) {
      return 1.0F;
   }
}
