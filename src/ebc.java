import com.mojang.serialization.MapCodec;
import java.util.List;

class ebc extends ebf {
   public static final MapCodec<ebc> a = a(ebc::new);

   public ebc(List<ebd> $$0) {
      super($$0);
   }

   public boolean a(dep $$0, je $$1) {
      for (ebd $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ebe<?> a() {
      return ebe.i;
   }
}
