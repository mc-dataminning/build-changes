import com.mojang.serialization.Codec;
import java.util.List;

class dts extends dtv {
   public static final Codec<dts> a = a(dts::new);

   public dts(List<dtt> $$0) {
      super($$0);
   }

   public boolean a(cxu $$0, ib $$1) {
      for (dtt $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dtu<?> a() {
      return dtu.i;
   }
}
