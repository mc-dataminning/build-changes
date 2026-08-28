import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwj extends dna implements dra {
   public static final MapCodec<dwj> a = b(dwj::new);

   public dwj(ebp.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eaj($$0, $$1);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1.c_($$2) instanceof eaj $$6) {
         if (!$$3.gH()) {
            return bvc.e;
         } else {
            if ($$3.cU().C) {
               $$3.a($$6);
            }

            return bvc.a;
         }
      } else {
         return bvc.e;
      }
   }

   @Override
   protected MapCodec<dwj> a() {
      return a;
   }
}
