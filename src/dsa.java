import com.mojang.serialization.Codec;
import java.util.List;

class dsa extends dse {
   public static final Codec<dsa> a = a(dsa::new);

   public dsa(List<dsc> $$0) {
      super($$0);
   }

   public boolean a(cwm $$0, hz $$1) {
      for (dsc $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dsd<?> a() {
      return dsd.j;
   }
}
