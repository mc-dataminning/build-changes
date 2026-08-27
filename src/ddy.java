import com.mojang.serialization.MapCodec;

public class ddy extends cyi {
   public static final MapCodec<ddy> c = b(ddy::new);
   protected static final ekb g = cut.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<ddy> a() {
      return c;
   }

   public ddy(dgv.d $$0) {
      super($$0, hx.a, g, false, 0.1);
   }

   @Override
   protected int a(ato $$0) {
      return czy.a($$0);
   }

   @Override
   protected cut b() {
      return cuv.oA;
   }

   @Override
   protected boolean g(dgw $$0) {
      return czy.a($$0);
   }
}
