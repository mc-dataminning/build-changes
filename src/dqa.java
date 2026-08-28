import com.mojang.serialization.MapCodec;

public abstract class dqa extends dma {
   public static final eax<ja> e = eap.T;

   protected dqa(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqa> a();

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
