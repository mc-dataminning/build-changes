import com.mojang.serialization.MapCodec;
import java.util.List;

class eev extends eez {
   public static final MapCodec<eev> a = a(eev::new);

   public eev(List<eex> $$0) {
      super($$0);
   }

   public boolean a(dig $$0, jh $$1) {
      for (eex $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eey<?> a() {
      return eey.j;
   }
}
