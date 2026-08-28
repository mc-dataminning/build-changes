import com.mojang.serialization.MapCodec;
import java.util.List;

class eht extends ehw {
   public static final MapCodec<eht> a = a(eht::new);

   public eht(List<ehu> $$0) {
      super($$0);
   }

   public boolean a(dkg $$0, iv $$1) {
      for (ehu $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ehv<?> a() {
      return ehv.i;
   }
}
