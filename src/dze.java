import com.mojang.serialization.MapCodec;
import java.util.List;

class dze extends dzi {
   public static final MapCodec<dze> a = a(dze::new);

   public dze(List<dzg> $$0) {
      super($$0);
   }

   public boolean a(dcz $$0, ja $$1) {
      for (dzg $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dzh<?> a() {
      return dzh.j;
   }
}
