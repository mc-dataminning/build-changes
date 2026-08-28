import com.mojang.serialization.MapCodec;

public class dqb extends djv {
   public static final MapCodec<dqb> a = b(dqb::new);
   protected static final float b = 6.0F;
   protected static final fbt c = djl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   protected dqb(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djn.ek) || super.b($$0, $$1, $$2);
   }
}
