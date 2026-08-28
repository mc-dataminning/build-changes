import com.mojang.serialization.MapCodec;
import java.util.List;

class ecl extends eco {
   public static final MapCodec<ecl> a = a(ecl::new);

   public ecl(List<ecm> $$0) {
      super($$0);
   }

   public boolean a(dfy $$0, jh $$1) {
      for (ecm $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ecn<?> a() {
      return ecn.i;
   }
}
