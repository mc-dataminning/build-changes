import com.mojang.serialization.MapCodec;
import java.util.List;

class eii extends eim {
   public static final MapCodec<eii> a = a(eii::new);

   public eii(List<eik> $$0) {
      super($$0);
   }

   public boolean a(dkw $$0, iv $$1) {
      for (eik $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eil<?> a() {
      return eil.j;
   }
}
