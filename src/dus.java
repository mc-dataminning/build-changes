import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dus extends dlm implements dpl {
   public static final MapCodec<dus> a = b(dus::new);

   public dus(dzy.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dys($$0, $$1);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1.c_($$2) instanceof dys $$6) {
         if (!$$3.gF()) {
            return bub.e;
         } else {
            if ($$3.cU().C) {
               $$3.a($$6);
            }

            return bub.a;
         }
      } else {
         return bub.e;
      }
   }

   @Override
   protected MapCodec<dus> a() {
      return a;
   }
}
