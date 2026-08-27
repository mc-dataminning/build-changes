import com.mojang.serialization.MapCodec;

public class dcm extends dco {
   public static final MapCodec<dcm> a = b(dcm::new);
   private static final eui b = dde.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dcm> a() {
      return a;
   }

   protected dcm(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }
}
