import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvm extends dmd implements dqd {
   public static final MapCodec<dvm> a = b(dvm::new);

   public dvm(eas.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzm($$0, $$1);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1.c_($$2) instanceof dzm $$6) {
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
   protected MapCodec<dvm> a() {
      return a;
   }
}
