import com.mojang.serialization.MapCodec;
import java.util.List;

class dyv extends dyy {
   public static final MapCodec<dyv> a = a(dyv::new);

   public dyv(List<dyw> $$0) {
      super($$0);
   }

   public boolean a(dco $$0, iz $$1) {
      for (dyw $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dyx<?> a() {
      return dyx.i;
   }
}
