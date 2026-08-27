import com.mojang.serialization.Codec;
import java.util.List;

class dlt extends dlw {
   public static final Codec<dlt> a = a(dlt::new);

   public dlt(List<dlu> $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, gw $$1) {
      for (dlu $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dlv<?> a() {
      return dlv.i;
   }
}
