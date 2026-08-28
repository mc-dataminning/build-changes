import com.mojang.serialization.MapCodec;
import java.util.List;

class ece extends eci {
   public static final MapCodec<ece> a = a(ece::new);

   public ece(List<ecg> $$0) {
      super($$0);
   }

   public boolean a(dfs $$0, jg $$1) {
      for (ecg $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ech<?> a() {
      return ech.j;
   }
}
