import com.mojang.serialization.MapCodec;

public class ddj extends cyi {
   public static final MapCodec<ddj> c = b(ddj::new);
   public static final ekb g = cut.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<ddj> a() {
      return c;
   }

   public ddj(dgv.d $$0) {
      super($$0, hx.b, g, false, 0.1);
   }

   @Override
   protected int a(ato $$0) {
      return czy.a($$0);
   }

   @Override
   protected cut b() {
      return cuv.oC;
   }

   @Override
   protected boolean g(dgw $$0) {
      return czy.a($$0);
   }
}
