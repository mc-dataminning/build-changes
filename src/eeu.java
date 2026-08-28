import com.mojang.serialization.MapCodec;
import java.util.List;

class eeu extends eex {
   public static final MapCodec<eeu> a = a(eeu::new);

   public eeu(List<eev> $$0) {
      super($$0);
   }

   public boolean a(dhy $$0, ji $$1) {
      for (eev $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eew<?> a() {
      return eew.i;
   }
}
