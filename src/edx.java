import com.mojang.serialization.MapCodec;
import java.util.List;

class edx extends eea {
   public static final MapCodec<edx> a = a(edx::new);

   public edx(List<edy> $$0) {
      super($$0);
   }

   public boolean a(dhf $$0, ji $$1) {
      for (edy $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public edz<?> a() {
      return edz.i;
   }
}
