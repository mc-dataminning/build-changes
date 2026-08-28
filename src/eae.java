import com.mojang.serialization.MapCodec;
import java.util.List;

class eae extends eah {
   public static final MapCodec<eae> a = a(eae::new);

   public eae(List<eaf> $$0) {
      super($$0);
   }

   public boolean a(dds $$0, jd $$1) {
      for (eaf $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eag<?> a() {
      return eag.i;
   }
}
