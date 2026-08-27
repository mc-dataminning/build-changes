import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fqb implements asg {
   private Map<fqd, fql> a = ImmutableMap.of();

   public fqf a(fqd $$0) {
      fql $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(asf $$0) {
      this.a = ImmutableMap.copyOf(fqc.a());
   }
}
