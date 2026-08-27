import com.mojang.serialization.MapCodec;

public class dhk extends dch {
   public static final MapCodec<dhk> c = b(dhk::new);
   public static final eos g = cys.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dhk> a() {
      return c;
   }

   public dhk(dli.d $$0) {
      super($$0, ie.b, g, false, 0.1);
   }

   @Override
   protected int a(awp $$0) {
      return ddx.a($$0);
   }

   @Override
   protected cys b() {
      return cyu.oC;
   }

   @Override
   protected boolean g(dlj $$0) {
      return ddx.a($$0);
   }
}
