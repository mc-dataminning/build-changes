import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtj extends dkg implements doe {
   public static final MapCodec<dtj> a = b(dtj::new);

   public dtj(dyl.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxg($$0, $$1);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.c_($$2) instanceof dxg $$6) {
         if (!$$3.gF()) {
            return btq.e;
         } else {
            if ($$3.cU().C) {
               $$3.a($$6);
            }

            return btq.a;
         }
      } else {
         return btq.e;
      }
   }

   @Override
   protected MapCodec<dtj> a() {
      return a;
   }
}
