import com.mojang.serialization.MapCodec;
import java.util.List;

class eab extends eae {
   public static final MapCodec<eab> a = a(eab::new);

   public eab(List<eac> $$0) {
      super($$0);
   }

   public boolean a(ddq $$0, jd $$1) {
      for (eac $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ead<?> a() {
      return ead.i;
   }
}
