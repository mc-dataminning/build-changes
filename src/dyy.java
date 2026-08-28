import com.mojang.serialization.MapCodec;
import java.util.List;

class dyy extends dzb {
   public static final MapCodec<dyy> a = a(dyy::new);

   public dyy(List<dyz> $$0) {
      super($$0);
   }

   public boolean a(dcr $$0, iz $$1) {
      for (dyz $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dza<?> a() {
      return dza.i;
   }
}
