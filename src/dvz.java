import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvz extends dmq implements dqq {
   public static final MapCodec<dvz> a = b(dvz::new);

   public dvz(ebf.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzz($$0, $$1);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.c_($$2) instanceof dzz $$6) {
         if (!$$3.gG()) {
            return but.e;
         } else {
            if ($$3.cU().C) {
               $$3.a($$6);
            }

            return but.a;
         }
      } else {
         return but.e;
      }
   }

   @Override
   protected MapCodec<dvz> a() {
      return a;
   }
}
