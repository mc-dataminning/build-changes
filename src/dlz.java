import com.mojang.serialization.MapCodec;

public abstract class dlz extends die {
   public static final dwd aF = dvz.R;

   protected dlz(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlz> a();

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}
