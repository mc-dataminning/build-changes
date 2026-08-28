import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cga extends cgl<bwb> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.X);
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      if ($$1.bj()) {
         $$1.eb().a(cff.X, bbk.a);
      } else {
         $$1.eb().b(cff.X);
      }
   }
}
