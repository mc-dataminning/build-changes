import com.mojang.serialization.MapCodec;
import java.util.List;

class ecw extends ecz {
   public static final MapCodec<ecw> a = a(ecw::new);

   public ecw(List<ecx> $$0) {
      super($$0);
   }

   public boolean a(dgk $$0, jh $$1) {
      for (ecx $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ecy<?> a() {
      return ecy.i;
   }
}
