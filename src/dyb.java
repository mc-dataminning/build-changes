import com.mojang.serialization.MapCodec;
import java.util.List;

class dyb extends dye {
   public static final MapCodec<dyb> a = a(dyb::new);

   public dyb(List<dyc> $$0) {
      super($$0);
   }

   public boolean a(dbu $$0, io $$1) {
      for (dyc $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dyd<?> a() {
      return dyd.i;
   }
}
