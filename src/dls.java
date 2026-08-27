import com.mojang.serialization.Codec;
import java.util.List;

class dls extends dlv {
   public static final Codec<dls> a = a(dls::new);

   public dls(List<dlt> $$0) {
      super($$0);
   }

   public boolean a(cqv $$0, gw $$1) {
      for (dlt $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dlu<?> a() {
      return dlu.i;
   }
}
