import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cgf extends cgq<bwg> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.X);
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      if ($$1.bj()) {
         $$1.ec().a(cfk.X, bbk.a);
      } else {
         $$1.ec().b(cfk.X);
      }
   }
}
