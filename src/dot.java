import com.mojang.serialization.MapCodec;

public class dot extends djv {
   public static final MapCodec<dot> a = b(dot::new);
   protected static final fbt b = djl.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djn.ek) || super.b($$0, $$1, $$2);
   }
}
