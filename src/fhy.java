import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fhy implements anu {
   private Map<fia, fii> a = ImmutableMap.of();

   public fic a(fia $$0) {
      fii $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(ant $$0) {
      this.a = ImmutableMap.copyOf(fhz.a());
   }
}
