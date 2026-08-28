import com.mojang.serialization.MapCodec;
import java.util.List;

class ecf extends eci {
   public static final MapCodec<ecf> a = a(ecf::new);

   public ecf(List<ecg> $$0) {
      super($$0);
   }

   public boolean a(dfs $$0, jg $$1) {
      for (ecg $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ech<?> a() {
      return ech.i;
   }
}
