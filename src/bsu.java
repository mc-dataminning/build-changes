import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bsu extends bte<biy> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.W);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      if ($$1.aX()) {
         $$1.dM().a(bsa.W, asp.a);
      } else {
         $$1.dM().b(bsa.W);
      }
   }
}
