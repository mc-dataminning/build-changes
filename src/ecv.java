import com.mojang.serialization.MapCodec;
import java.util.List;

class ecv extends ecz {
   public static final MapCodec<ecv> a = a(ecv::new);

   public ecv(List<ecx> $$0) {
      super($$0);
   }

   public boolean a(dgk $$0, jh $$1) {
      for (ecx $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ecy<?> a() {
      return ecy.j;
   }
}
