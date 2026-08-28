import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duj extends dlg implements dpe {
   public static final MapCodec<duj> a = b(duj::new);

   public duj(dzn.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyi($$0, $$1);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.c_($$2) instanceof dyi $$6) {
         if (!$$3.gF()) {
            return bty.e;
         } else {
            if ($$3.cU().C) {
               $$3.a($$6);
            }

            return bty.a;
         }
      } else {
         return bty.e;
      }
   }

   @Override
   protected MapCodec<duj> a() {
      return a;
   }
}
