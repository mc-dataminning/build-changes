import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvx extends dmo implements dqo {
   public static final MapCodec<dvx> a = b(dvx::new);

   public dvx(ebd.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzx($$0, $$1);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.c_($$2) instanceof dzx $$6) {
         if (!$$3.gG()) {
            return bur.e;
         } else {
            if ($$3.cU().C) {
               $$3.a($$6);
            }

            return bur.a;
         }
      } else {
         return bur.e;
      }
   }

   @Override
   protected MapCodec<dvx> a() {
      return a;
   }
}
