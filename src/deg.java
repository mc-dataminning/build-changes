import com.mojang.serialization.MapCodec;

public class deg extends dei {
   public static final MapCodec<deg> a = b(deg::new);
   private static final ewj b = dey.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends deg> a() {
      return a;
   }

   protected deg(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }
}
