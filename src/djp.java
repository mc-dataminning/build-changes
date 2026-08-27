import com.mojang.serialization.MapCodec;

public class djp extends ddn {
   public static final MapCodec<djp> a = b(djp::new);
   protected static final float b = 6.0F;
   protected static final eui c = dde.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   protected djp(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(avr.aL) || $$0.a(ddg.dX) || super.b($$0, $$1, $$2);
   }
}
