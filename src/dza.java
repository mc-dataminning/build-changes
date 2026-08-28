import com.mojang.serialization.MapCodec;
import java.util.List;

class dza extends dzd {
   public static final MapCodec<dza> a = a(dza::new);

   public dza(List<dzb> $$0) {
      super($$0);
   }

   public boolean a(dct $$0, iz $$1) {
      for (dzb $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dzc<?> a() {
      return dzc.i;
   }
}
