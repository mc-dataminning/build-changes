import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class frb implements asp {
   private Map<frd, frl> a = ImmutableMap.of();

   public frf a(frd $$0) {
      frl $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aso $$0) {
      this.a = ImmutableMap.copyOf(frc.a());
   }
}
