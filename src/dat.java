import com.mojang.serialization.MapCodec;

public abstract class dat extends cwy {
   public static final dkj aE = dkf.R;

   protected dat(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dat> a();

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
