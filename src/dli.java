import com.mojang.serialization.MapCodec;

public abstract class dli extends dhm {
   public static final dvm aF = dvi.R;

   protected dli(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dli> a();

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}
