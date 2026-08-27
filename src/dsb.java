import com.mojang.serialization.Codec;
import java.util.List;

class dsb extends dse {
   public static final Codec<dsb> a = a(dsb::new);

   public dsb(List<dsc> $$0) {
      super($$0);
   }

   public boolean a(cwm $$0, hz $$1) {
      for (dsc $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dsd<?> a() {
      return dsd.i;
   }
}
