import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fis implements aou {
   private Map<fiu, fjc> a = ImmutableMap.of();

   public fiw a(fiu $$0) {
      fjc $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aot $$0) {
      this.a = ImmutableMap.copyOf(fit.a());
   }
}
