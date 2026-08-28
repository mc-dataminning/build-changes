import com.mojang.serialization.MapCodec;
import java.util.List;

class eck extends eco {
   public static final MapCodec<eck> a = a(eck::new);

   public eck(List<ecm> $$0) {
      super($$0);
   }

   public boolean a(dfy $$0, jh $$1) {
      for (ecm $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ecn<?> a() {
      return ecn.j;
   }
}
