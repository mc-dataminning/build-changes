import com.mojang.serialization.Codec;
import java.util.List;

class dlx extends dmb {
   public static final Codec<dlx> a = a(dlx::new);

   public dlx(List<dlz> $$0) {
      super($$0);
   }

   public boolean a(cqp $$0, gw $$1) {
      for (dlz $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dma<?> a() {
      return dma.j;
   }
}
