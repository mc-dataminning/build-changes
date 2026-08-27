import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fkp implements apm {
   private Map<fkr, fkz> a = ImmutableMap.of();

   public fkt a(fkr $$0) {
      fkz $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(apl $$0) {
      this.a = ImmutableMap.copyOf(fkq.a());
   }
}
