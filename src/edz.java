import com.mojang.serialization.MapCodec;
import java.util.List;

class edz extends eec {
   public static final MapCodec<edz> a = a(edz::new);

   public edz(List<eea> $$0) {
      super($$0);
   }

   public boolean a(dhh $$0, ji $$1) {
      for (eea $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eeb<?> a() {
      return eeb.i;
   }
}
