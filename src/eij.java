import com.mojang.serialization.MapCodec;
import java.util.List;

class eij extends eim {
   public static final MapCodec<eij> a = a(eij::new);

   public eij(List<eik> $$0) {
      super($$0);
   }

   public boolean a(dkw $$0, iv $$1) {
      for (eik $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eil<?> a() {
      return eil.i;
   }
}
