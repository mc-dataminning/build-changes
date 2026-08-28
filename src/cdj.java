import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdj extends cdu<btk> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.X);
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      if ($$1.be()) {
         $$1.dS().a(cco.X, azx.a);
      } else {
         $$1.dS().b(cco.X);
      }
   }
}
