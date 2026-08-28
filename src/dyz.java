import com.mojang.serialization.MapCodec;
import java.util.List;

class dyz extends dzd {
   public static final MapCodec<dyz> a = a(dyz::new);

   public dyz(List<dzb> $$0) {
      super($$0);
   }

   public boolean a(dct $$0, iz $$1) {
      for (dzb $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dzc<?> a() {
      return dzc.j;
   }
}
