import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fjx implements ape {
   private Map<fjz, fkh> a = ImmutableMap.of();

   public fkb a(fjz $$0) {
      fkh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(apd $$0) {
      this.a = ImmutableMap.copyOf(fjy.a());
   }
}
