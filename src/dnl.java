import com.mojang.serialization.Codec;
import java.util.List;

class dnl extends dno {
   public static final Codec<dnl> a = a(dnl::new);

   public dnl(List<dnm> $$0) {
      super($$0);
   }

   public boolean a(csm $$0, ht $$1) {
      for (dnm $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dnn<?> a() {
      return dnn.i;
   }
}
