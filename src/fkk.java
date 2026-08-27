import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fkk implements api {
   private Map<fkm, fku> a = ImmutableMap.of();

   public fko a(fkm $$0) {
      fku $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aph $$0) {
      this.a = ImmutableMap.copyOf(fkl.a());
   }
}
