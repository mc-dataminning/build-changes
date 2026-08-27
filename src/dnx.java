import com.mojang.serialization.Codec;
import java.util.List;

class dnx extends doa {
   public static final Codec<dnx> a = a(dnx::new);

   public dnx(List<dny> $$0) {
      super($$0);
   }

   public boolean a(csu $$0, ht $$1) {
      for (dny $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dnz<?> a() {
      return dnz.i;
   }
}
