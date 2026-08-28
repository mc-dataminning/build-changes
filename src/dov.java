import com.mojang.serialization.MapCodec;

public class dov extends djx {
   public static final MapCodec<dov> a = b(dov::new);
   protected static final fbv b = djn.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   public dov(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djp.ek) || super.b($$0, $$1, $$2);
   }
}
