import com.mojang.serialization.MapCodec;

public class dsd extends dnd {
   public static final MapCodec<dsd> b = b(dsd::new);

   protected dsd(dww.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dsd> a() {
      return b;
   }

   @Override
   protected fbu c(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return fbr.a();
   }

   @Override
   protected float c(dwx $$0, dfn $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dwx $$0) {
      return true;
   }
}
