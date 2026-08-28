import com.mojang.serialization.MapCodec;

public abstract class drp extends dno {
   public static final eco<jc> e = ecg.T;

   protected drp(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends drp> a();

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
