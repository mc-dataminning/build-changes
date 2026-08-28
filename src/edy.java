import com.mojang.serialization.MapCodec;
import java.util.List;

class edy extends eeb {
   public static final MapCodec<edy> a = a(edy::new);

   public edy(List<edz> $$0) {
      super($$0);
   }

   public boolean a(dhg $$0, ji $$1) {
      for (edz $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eea<?> a() {
      return eea.i;
   }
}
