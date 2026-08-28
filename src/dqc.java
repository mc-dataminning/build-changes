import com.mojang.serialization.MapCodec;

public class dqc extends djw {
   public static final MapCodec<dqc> a = b(dqc::new);
   protected static final float b = 6.0F;
   protected static final fbu c = djm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   protected dqc(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djo.ek) || super.b($$0, $$1, $$2);
   }
}
