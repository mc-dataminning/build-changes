import com.mojang.serialization.MapCodec;
import java.util.List;

class dyy extends dzc {
   public static final MapCodec<dyy> a = a(dyy::new);

   public dyy(List<dza> $$0) {
      super($$0);
   }

   public boolean a(dcs $$0, iz $$1) {
      for (dza $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dzb<?> a() {
      return dzb.j;
   }
}
