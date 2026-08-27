import com.mojang.serialization.MapCodec;

public class did extends dde {
   public static final MapCodec<did> a = b(did::new);
   protected static final eui b = dde.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      return euf.b();
   }

   @Override
   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.b();
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected float d(dqh $$0, czj $$1, in $$2) {
      return 0.2F;
   }
}
