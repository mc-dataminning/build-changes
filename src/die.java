import com.mojang.serialization.MapCodec;

public class die extends dch {
   public static final MapCodec<die> c = b(die::new);
   protected static final eos g = cys.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<die> a() {
      return c;
   }

   public die(dli.d $$0) {
      super($$0, ie.a, g, false, 0.1);
   }

   @Override
   protected int a(awp $$0) {
      return ddx.a($$0);
   }

   @Override
   protected cys b() {
      return cyu.oA;
   }

   @Override
   protected boolean g(dlj $$0) {
      return ddx.a($$0);
   }
}
