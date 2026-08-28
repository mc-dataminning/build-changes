import com.mojang.serialization.MapCodec;
import java.util.List;

class ehs extends ehw {
   public static final MapCodec<ehs> a = a(ehs::new);

   public ehs(List<ehu> $$0) {
      super($$0);
   }

   public boolean a(dkg $$0, iv $$1) {
      for (ehu $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ehv<?> a() {
      return ehv.j;
   }
}
