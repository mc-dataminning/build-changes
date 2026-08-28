import com.mojang.serialization.MapCodec;
import java.util.List;

class edx extends eeb {
   public static final MapCodec<edx> a = a(edx::new);

   public edx(List<edz> $$0) {
      super($$0);
   }

   public boolean a(dhg $$0, ji $$1) {
      for (edz $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eea<?> a() {
      return eea.j;
   }
}
