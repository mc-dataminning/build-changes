import com.mojang.serialization.Codec;
import java.util.List;

class dpo extends dps {
   public static final Codec<dpo> a = a(dpo::new);

   public dpo(List<dpq> $$0) {
      super($$0);
   }

   public boolean a(cud $$0, hx $$1) {
      for (dpq $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dpr<?> a() {
      return dpr.j;
   }
}
