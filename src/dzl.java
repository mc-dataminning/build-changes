import com.mojang.serialization.MapCodec;
import java.util.List;

class dzl extends dzp {
   public static final MapCodec<dzl> a = a(dzl::new);

   public dzl(List<dzn> $$0) {
      super($$0);
   }

   public boolean a(ddc $$0, ja $$1) {
      for (dzn $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dzo<?> a() {
      return dzo.j;
   }
}
