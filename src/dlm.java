import com.mojang.serialization.MapCodec;

public class dlm extends dlq {
   public static final MapCodec<dlm> a = b(dlm::new);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return false;
   }

   @Override
   protected int g(dqh $$0, czj $$1, in $$2) {
      return $$1.P();
   }
}
