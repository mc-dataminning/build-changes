import com.mojang.serialization.MapCodec;

public class diw extends dix {
   public static final MapCodec<diw> a = b(diw::new);
   protected static final float b = 6.0F;
   protected static final fbv c = djn.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   protected diw(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }
}
