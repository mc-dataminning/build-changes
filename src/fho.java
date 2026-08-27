import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fho implements ann {
   private Map<fhq, fhy> a = ImmutableMap.of();

   public fhs a(fhq $$0) {
      fhy $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(anm $$0) {
      this.a = ImmutableMap.copyOf(fhp.a());
   }
}
