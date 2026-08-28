import com.mojang.serialization.MapCodec;

public class dqd extends djx {
   public static final MapCodec<dqd> a = b(dqd::new);
   protected static final float b = 6.0F;
   protected static final fbv c = djn.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   protected dqd(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djp.ek) || super.b($$0, $$1, $$2);
   }
}
