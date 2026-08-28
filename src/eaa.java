import com.mojang.serialization.MapCodec;
import java.util.List;

class eaa extends eae {
   public static final MapCodec<eaa> a = a(eaa::new);

   public eaa(List<eac> $$0) {
      super($$0);
   }

   public boolean a(ddq $$0, jd $$1) {
      for (eac $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ead<?> a() {
      return ead.j;
   }
}
