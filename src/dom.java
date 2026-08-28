import com.mojang.serialization.MapCodec;

public class dom extends din {
   public static final MapCodec<dom> c = b(dom::new);
   protected static final ewj g = dey.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dom> a() {
      return c;
   }

   public dom(dsa.d $$0) {
      super($$0, je.a, g, false, 0.1);
   }

   @Override
   protected int a(azg $$0) {
      return dke.a($$0);
   }

   @Override
   protected dey b() {
      return dfa.oA;
   }

   @Override
   protected boolean g(dsb $$0) {
      return dke.a($$0);
   }
}
