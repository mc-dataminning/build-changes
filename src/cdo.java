import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdo extends cdz<btp> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.X);
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      if ($$1.be()) {
         $$1.dS().a(cct.X, bac.a);
      } else {
         $$1.dS().b(cct.X);
      }
   }
}
