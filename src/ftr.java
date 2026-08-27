import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ftr implements atf {
   private Map<ftt, fub> a = ImmutableMap.of();

   public ftv a(ftt $$0) {
      fub $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(ate $$0) {
      this.a = ImmutableMap.copyOf(fts.a());
   }
}
