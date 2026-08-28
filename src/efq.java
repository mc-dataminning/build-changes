import com.mojang.serialization.MapCodec;
import java.util.List;

class efq extends efu {
   public static final MapCodec<efq> a = a(efq::new);

   public efq(List<efs> $$0) {
      super($$0);
   }

   public boolean a(dio $$0, jj $$1) {
      for (efs $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eft<?> a() {
      return eft.j;
   }
}
