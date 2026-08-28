import com.mojang.serialization.MapCodec;

public abstract class diq extends deu {
   public static final dsr aE = dsn.R;

   protected diq(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends diq> a();

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
