import com.mojang.serialization.Codec;
import java.util.List;

class dxe extends dxi {
   public static final Codec<dxe> a = a(dxe::new);

   public dxe(List<dxg> $$0) {
      super($$0);
   }

   public boolean a(day $$0, in $$1) {
      for (dxg $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dxh<?> a() {
      return dxh.j;
   }
}
