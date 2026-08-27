import com.mojang.serialization.MapCodec;
import java.util.List;

class dxy extends dyc {
   public static final MapCodec<dxy> a = a(dxy::new);

   public dxy(List<dya> $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, io $$1) {
      for (dya $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dyb<?> a() {
      return dyb.j;
   }
}
