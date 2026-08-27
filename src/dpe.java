import com.mojang.serialization.Codec;
import java.util.List;

class dpe extends dph {
   public static final Codec<dpe> a = a(dpe::new);

   public dpe(List<dpf> $$0) {
      super($$0);
   }

   public boolean a(ctt $$0, hv $$1) {
      for (dpf $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dpg<?> a() {
      return dpg.i;
   }
}
