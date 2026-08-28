import com.mojang.serialization.MapCodec;
import java.util.List;

class dyz extends dzc {
   public static final MapCodec<dyz> a = a(dyz::new);

   public dyz(List<dza> $$0) {
      super($$0);
   }

   public boolean a(dcs $$0, iz $$1) {
      for (dza $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dzb<?> a() {
      return dzb.i;
   }
}
