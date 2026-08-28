import com.mojang.serialization.MapCodec;
import java.util.List;

class eep extends ees {
   public static final MapCodec<eep> a = a(eep::new);

   public eep(List<eeq> $$0) {
      super($$0);
   }

   public boolean a(dhx $$0, jh $$1) {
      for (eeq $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eer<?> a() {
      return eer.i;
   }
}
