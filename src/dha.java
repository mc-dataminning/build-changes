import com.mojang.serialization.MapCodec;

public abstract class dha extends dde {
   public static final drb aE = dqx.R;

   protected dha(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dha> a();

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
