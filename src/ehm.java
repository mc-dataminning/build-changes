import com.mojang.serialization.MapCodec;
import java.util.List;

class ehm extends ehp {
   public static final MapCodec<ehm> a = a(ehm::new);

   public ehm(List<ehn> $$0) {
      super($$0);
   }

   public boolean a(djz $$0, iu $$1) {
      for (ehn $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eho<?> a() {
      return eho.i;
   }
}
