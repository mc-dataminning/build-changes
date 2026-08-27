import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fia implements anw {
   private Map<fic, fik> a = ImmutableMap.of();

   public fie a(fic $$0) {
      fik $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(anv $$0) {
      this.a = ImmutableMap.copyOf(fib.a());
   }
}
