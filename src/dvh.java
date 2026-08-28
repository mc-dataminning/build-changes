import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvh extends dly implements dpy {
   public static final MapCodec<dvh> a = b(dvh::new);

   public dvh(ean.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzh($$0, $$1);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1.c_($$2) instanceof dzh $$6) {
         if (!$$3.gF()) {
            return bug.e;
         } else {
            if ($$3.cT().C) {
               $$3.a($$6);
            }

            return bug.a;
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected MapCodec<dvh> a() {
      return a;
   }
}
