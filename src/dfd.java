import com.mojang.serialization.MapCodec;

public class dfd extends ddn {
   public static final MapCodec<dfd> a = b(dfd::new);
   protected static final float b = 6.0F;
   protected static final eui c = dde.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   protected dfd(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(avr.cl);
   }
}
