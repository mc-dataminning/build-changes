import com.mojang.serialization.Codec;
import java.util.List;

class dsw extends dsz {
   public static final Codec<dsw> a = a(dsw::new);

   public dsw(List<dsx> $$0) {
      super($$0);
   }

   public boolean a(cwz $$0, ib $$1) {
      for (dsx $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dsy<?> a() {
      return dsy.i;
   }
}
