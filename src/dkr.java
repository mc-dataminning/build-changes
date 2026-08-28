import com.mojang.serialization.MapCodec;

public abstract class dkr extends dgv {
   public static final duu aE = duq.R;

   protected dkr(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkr> a();

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
