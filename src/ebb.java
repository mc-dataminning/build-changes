import com.mojang.serialization.MapCodec;
import java.util.List;

class ebb extends ebf {
   public static final MapCodec<ebb> a = a(ebb::new);

   public ebb(List<ebd> $$0) {
      super($$0);
   }

   public boolean a(dep $$0, je $$1) {
      for (ebd $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ebe<?> a() {
      return ebe.j;
   }
}
