import com.mojang.serialization.MapCodec;
import java.util.List;

class ehe extends ehh {
   public static final MapCodec<ehe> a = a(ehe::new);

   public ehe(List<ehf> $$0) {
      super($$0);
   }

   public boolean a(dju $$0, iu $$1) {
      for (ehf $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ehg<?> a() {
      return ehg.i;
   }
}
