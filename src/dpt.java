import com.mojang.serialization.MapCodec;

public abstract class dpt extends dlu {
   public static final eam<ja> e = eae.T;

   protected dpt(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpt> a();

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
