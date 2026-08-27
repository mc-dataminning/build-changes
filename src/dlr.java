import com.mojang.serialization.Codec;
import java.util.List;

class dlr extends dlv {
   public static final Codec<dlr> a = a(dlr::new);

   public dlr(List<dlt> $$0) {
      super($$0);
   }

   public boolean a(cqv $$0, gw $$1) {
      for (dlt $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dlu<?> a() {
      return dlu.j;
   }
}
