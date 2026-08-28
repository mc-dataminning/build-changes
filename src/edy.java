import com.mojang.serialization.MapCodec;
import java.util.List;

class edy extends eec {
   public static final MapCodec<edy> a = a(edy::new);

   public edy(List<eea> $$0) {
      super($$0);
   }

   public boolean a(dhh $$0, ji $$1) {
      for (eea $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eeb<?> a() {
      return eeb.j;
   }
}
