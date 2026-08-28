import com.mojang.serialization.MapCodec;

public abstract class dml extends diq {
   public static final dws<jm> aF = dwl.R;

   protected dml(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dml> a();

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}
