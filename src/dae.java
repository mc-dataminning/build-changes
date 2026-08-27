import com.mojang.serialization.MapCodec;

public abstract class dae extends cwj {
   public static final dju aE = djq.R;

   protected dae(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dae> a();

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
