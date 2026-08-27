import com.mojang.serialization.Codec;
import java.util.List;

class dpp extends dps {
   public static final Codec<dpp> a = a(dpp::new);

   public dpp(List<dpq> $$0) {
      super($$0);
   }

   public boolean a(cud $$0, hx $$1) {
      for (dpq $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dpr<?> a() {
      return dpr.i;
   }
}
