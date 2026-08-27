import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fht implements anq {
   private Map<fhv, fid> a = ImmutableMap.of();

   public fhx a(fhv $$0) {
      fid $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(anp $$0) {
      this.a = ImmutableMap.copyOf(fhu.a());
   }
}
