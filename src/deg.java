import com.mojang.serialization.MapCodec;

public class deg extends deh {
   public static final MapCodec<deg> a = b(deg::new);
   protected static final float b = 6.0F;
   protected static final ewi c = dex.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   protected deg(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }
}
