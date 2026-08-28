import com.mojang.serialization.MapCodec;
import java.util.List;

class eik extends eio {
   public static final MapCodec<eik> a = a(eik::new);

   public eik(List<eim> $$0) {
      super($$0);
   }

   public boolean a(dky $$0, iw $$1) {
      for (eim $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ein<?> a() {
      return ein.j;
   }
}
