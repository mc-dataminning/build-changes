import com.mojang.serialization.MapCodec;
import java.util.List;

class dzc extends dzf {
   public static final MapCodec<dzc> a = a(dzc::new);

   public dzc(List<dzd> $$0) {
      super($$0);
   }

   public boolean a(dcv $$0, iz $$1) {
      for (dzd $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dze<?> a() {
      return dze.i;
   }
}
