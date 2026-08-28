import com.mojang.serialization.MapCodec;
import java.util.List;

class eeo extends eer {
   public static final MapCodec<eeo> a = a(eeo::new);

   public eeo(List<eep> $$0) {
      super($$0);
   }

   public boolean a(dhy $$0, jh $$1) {
      for (eep $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eeq<?> a() {
      return eeq.i;
   }
}
