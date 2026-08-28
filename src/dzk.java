import com.mojang.serialization.MapCodec;
import java.util.List;

class dzk extends dzo {
   public static final MapCodec<dzk> a = a(dzk::new);

   public dzk(List<dzm> $$0) {
      super($$0);
   }

   public boolean a(ddb $$0, ja $$1) {
      for (dzm $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dzn<?> a() {
      return dzn.j;
   }
}
