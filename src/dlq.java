import com.mojang.serialization.MapCodec;

public class dlq extends dgu {
   public static final MapCodec<dlq> b = b(dlq::new);

   protected dlq(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dlq> a() {
      return b;
   }

   @Override
   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.a();
   }

   @Override
   protected float d(dqh $$0, czj $$1, in $$2) {
      return 1.0F;
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return true;
   }
}
