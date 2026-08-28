import com.mojang.serialization.MapCodec;
import java.util.List;

class dzb extends dzf {
   public static final MapCodec<dzb> a = a(dzb::new);

   public dzb(List<dzd> $$0) {
      super($$0);
   }

   public boolean a(dcv $$0, iz $$1) {
      for (dzd $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dze<?> a() {
      return dze.j;
   }
}
