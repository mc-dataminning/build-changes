import com.mojang.serialization.MapCodec;
import java.util.List;

class efr extends efu {
   public static final MapCodec<efr> a = a(efr::new);

   public efr(List<efs> $$0) {
      super($$0);
   }

   public boolean a(dio $$0, jj $$1) {
      for (efs $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eft<?> a() {
      return eft.i;
   }
}
