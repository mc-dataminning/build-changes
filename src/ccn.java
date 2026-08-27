import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ccn extends ccy<bso> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.X);
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      if ($$1.be()) {
         $$1.dS().a(cbs.X, azf.a);
      } else {
         $$1.dS().b(cbs.X);
      }
   }
}
