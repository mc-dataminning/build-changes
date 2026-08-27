import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fti implements atd {
   private Map<ftk, fts> a = ImmutableMap.of();

   public ftm a(ftk $$0) {
      fts $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(atc $$0) {
      this.a = ImmutableMap.copyOf(ftj.a());
   }
}
