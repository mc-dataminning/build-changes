import com.mojang.serialization.MapCodec;

public abstract class drf extends dne {
   public static final ece<jc> e = ebw.T;

   protected drf(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends drf> a();

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
