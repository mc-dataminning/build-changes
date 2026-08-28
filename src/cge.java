import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cge extends cgp<bwf> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.X);
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      if ($$1.bj()) {
         $$1.ec().a(cfj.X, bbk.a);
      } else {
         $$1.ec().b(cfj.X);
      }
   }
}
