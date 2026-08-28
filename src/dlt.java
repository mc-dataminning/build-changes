import com.mojang.serialization.MapCodec;

public abstract class dlt extends dhy {
   public static final dvx aF = dvt.R;

   protected dlt(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlt> a();

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}
