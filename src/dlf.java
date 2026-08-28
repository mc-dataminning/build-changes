import com.mojang.serialization.MapCodec;

public abstract class dlf extends dhj {
   public static final dvi aF = dve.R;

   protected dlf(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlf> a();

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}
