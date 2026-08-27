import com.mojang.serialization.MapCodec;
import java.util.List;

class dya extends dye {
   public static final MapCodec<dya> a = a(dya::new);

   public dya(List<dyc> $$0) {
      super($$0);
   }

   public boolean a(dbu $$0, io $$1) {
      for (dyc $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dyd<?> a() {
      return dyd.j;
   }
}
