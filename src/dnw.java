import com.mojang.serialization.Codec;
import java.util.List;

class dnw extends doa {
   public static final Codec<dnw> a = a(dnw::new);

   public dnw(List<dny> $$0) {
      super($$0);
   }

   public boolean a(csu $$0, ht $$1) {
      for (dny $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dnz<?> a() {
      return dnz.j;
   }
}
