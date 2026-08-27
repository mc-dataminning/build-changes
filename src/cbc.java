import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cbc extends cbn<bre> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.X);
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      if ($$1.bc()) {
         $$1.dQ().a(cah.X, ayy.a);
      } else {
         $$1.dQ().b(cah.X);
      }
   }
}
