import com.mojang.serialization.MapCodec;
import java.util.List;

class ehl extends ehp {
   public static final MapCodec<ehl> a = a(ehl::new);

   public ehl(List<ehn> $$0) {
      super($$0);
   }

   public boolean a(djz $$0, iu $$1) {
      for (ehn $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eho<?> a() {
      return eho.j;
   }
}
