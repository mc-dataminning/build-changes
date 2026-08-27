import com.mojang.serialization.Codec;
import java.util.List;

class dzz extends ead {
   public static final Codec<dzz> a = a(dzz::new);

   public dzz(List<eab> $$0) {
      super($$0);
   }

   public boolean a(dcv $$0, ir $$1) {
      for (eab $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eac<?> a() {
      return eac.j;
   }
}
