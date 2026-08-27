import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fea implements aky {
   private Map<fec, fek> a = ImmutableMap.of();

   public fee a(fec $$0) {
      fek $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(akx $$0) {
      this.a = ImmutableMap.copyOf(feb.a());
   }
}
