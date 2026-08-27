import com.mojang.serialization.Codec;
import java.util.List;

class dsv extends dsz {
   public static final Codec<dsv> a = a(dsv::new);

   public dsv(List<dsx> $$0) {
      super($$0);
   }

   public boolean a(cwz $$0, ib $$1) {
      for (dsx $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dsy<?> a() {
      return dsy.j;
   }
}
