import com.mojang.serialization.MapCodec;

public class dse extends dne {
   public static final MapCodec<dse> b = b(dse::new);

   protected dse(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dse> a() {
      return b;
   }

   @Override
   protected fbv c(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return fbs.a();
   }

   @Override
   protected float c(dwy $$0, dfo $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dwy $$0) {
      return true;
   }
}
