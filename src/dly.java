import com.mojang.serialization.Codec;
import java.util.List;

class dly extends dmb {
   public static final Codec<dly> a = a(dly::new);

   public dly(List<dlz> $$0) {
      super($$0);
   }

   public boolean a(cqp $$0, gw $$1) {
      for (dlz $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dma<?> a() {
      return dma.i;
   }
}
