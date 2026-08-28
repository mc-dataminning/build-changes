import com.mojang.serialization.MapCodec;
import java.util.List;

class eew extends eez {
   public static final MapCodec<eew> a = a(eew::new);

   public eew(List<eex> $$0) {
      super($$0);
   }

   public boolean a(dig $$0, jh $$1) {
      for (eex $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eey<?> a() {
      return eey.i;
   }
}
