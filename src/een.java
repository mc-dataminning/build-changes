import com.mojang.serialization.MapCodec;
import java.util.List;

class een extends eer {
   public static final MapCodec<een> a = a(een::new);

   public een(List<eep> $$0) {
      super($$0);
   }

   public boolean a(dhy $$0, jh $$1) {
      for (eep $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eeq<?> a() {
      return eeq.j;
   }
}
