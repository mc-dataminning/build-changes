import com.mojang.serialization.Codec;
import java.util.List;

class dpd extends dph {
   public static final Codec<dpd> a = a(dpd::new);

   public dpd(List<dpf> $$0) {
      super($$0);
   }

   public boolean a(ctt $$0, hv $$1) {
      for (dpf $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dpg<?> a() {
      return dpg.j;
   }
}
