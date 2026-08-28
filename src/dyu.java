import com.mojang.serialization.MapCodec;
import java.util.List;

class dyu extends dyy {
   public static final MapCodec<dyu> a = a(dyu::new);

   public dyu(List<dyw> $$0) {
      super($$0);
   }

   public boolean a(dco $$0, iz $$1) {
      for (dyw $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dyx<?> a() {
      return dyx.j;
   }
}
