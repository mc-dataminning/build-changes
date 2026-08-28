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
         $$1.eb().a(cfj.X, bbk.a);
      } else {
         $$1.eb().b(cfj.X);
      }
   }
}
