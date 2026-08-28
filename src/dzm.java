import com.mojang.serialization.MapCodec;
import java.util.List;

class dzm extends dzp {
   public static final MapCodec<dzm> a = a(dzm::new);

   public dzm(List<dzn> $$0) {
      super($$0);
   }

   public boolean a(ddc $$0, ja $$1) {
      for (dzn $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dzo<?> a() {
      return dzo.i;
   }
}
