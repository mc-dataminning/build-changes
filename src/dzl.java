import com.mojang.serialization.MapCodec;
import java.util.List;

class dzl extends dzo {
   public static final MapCodec<dzl> a = a(dzl::new);

   public dzl(List<dzm> $$0) {
      super($$0);
   }

   public boolean a(ddb $$0, ja $$1) {
      for (dzm $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dzn<?> a() {
      return dzn.i;
   }
}
