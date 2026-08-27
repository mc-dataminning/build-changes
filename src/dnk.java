import com.mojang.serialization.Codec;
import java.util.List;

class dnk extends dno {
   public static final Codec<dnk> a = a(dnk::new);

   public dnk(List<dnm> $$0) {
      super($$0);
   }

   public boolean a(csm $$0, ht $$1) {
      for (dnm $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dnn<?> a() {
      return dnn.j;
   }
}
