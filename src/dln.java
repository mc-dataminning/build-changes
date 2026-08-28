import com.mojang.serialization.MapCodec;

public class dln extends djx {
   public static final MapCodec<dln> a = b(dln::new);
   protected static final float b = 6.0F;
   protected static final fbv c = djn.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   protected dln(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(awp.co);
   }
}
