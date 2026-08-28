import com.mojang.serialization.MapCodec;
import java.util.List;

class dza extends dze {
   public static final MapCodec<dza> a = a(dza::new);

   public dza(List<dzc> $$0) {
      super($$0);
   }

   public boolean a(dcu $$0, iz $$1) {
      for (dzc $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dzd<?> a() {
      return dzd.j;
   }
}
