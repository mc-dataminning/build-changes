import com.mojang.serialization.Codec;
import java.util.List;

class eaa extends ead {
   public static final Codec<eaa> a = a(eaa::new);

   public eaa(List<eab> $$0) {
      super($$0);
   }

   public boolean a(dcv $$0, ir $$1) {
      for (eab $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eac<?> a() {
      return eac.i;
   }
}
