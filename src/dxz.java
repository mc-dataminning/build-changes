import com.mojang.serialization.MapCodec;
import java.util.List;

class dxz extends dyc {
   public static final MapCodec<dxz> a = a(dxz::new);

   public dxz(List<dya> $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, io $$1) {
      for (dya $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dyb<?> a() {
      return dyb.i;
   }
}
