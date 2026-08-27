import com.mojang.serialization.Codec;
import java.util.List;

class dma extends dmd {
   public static final Codec<dma> a = a(dma::new);

   public dma(List<dmb> $$0) {
      super($$0);
   }

   public boolean a(cqr $$0, gw $$1) {
      for (dmb $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dmc<?> a() {
      return dmc.i;
   }
}
