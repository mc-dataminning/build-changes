import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfh extends cfs<bvi> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.X);
   }

   @Override
   protected void a(ard $$0, bvi $$1) {
      if ($$1.bj()) {
         $$1.eb().a(cem.X, baf.a);
      } else {
         $$1.eb().b(cem.X);
      }
   }
}
