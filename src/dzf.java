import com.mojang.serialization.MapCodec;
import java.util.List;

class dzf extends dzi {
   public static final MapCodec<dzf> a = a(dzf::new);

   public dzf(List<dzg> $$0) {
      super($$0);
   }

   public boolean a(dcz $$0, ja $$1) {
      for (dzg $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dzh<?> a() {
      return dzh.i;
   }
}
