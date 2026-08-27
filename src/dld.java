import com.mojang.serialization.MapCodec;

public class dld extends dde {
   public static final MapCodec<dld> a = b(dld::new);
   private static final double b = 5.0;
   private static final eui c = dde.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.a;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected float d(dqh $$0, czj $$1, in $$2) {
      return 1.0F;
   }
}
