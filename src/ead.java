import com.mojang.serialization.MapCodec;
import java.util.List;

class ead extends eah {
   public static final MapCodec<ead> a = a(ead::new);

   public ead(List<eaf> $$0) {
      super($$0);
   }

   public boolean a(dds $$0, jd $$1) {
      for (eaf $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eag<?> a() {
      return eag.j;
   }
}
