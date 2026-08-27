import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fpf implements asc {
   private Map<fph, fpp> a = ImmutableMap.of();

   public fpj a(fph $$0) {
      fpp $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(asb $$0) {
      this.a = ImmutableMap.copyOf(fpg.a());
   }
}
