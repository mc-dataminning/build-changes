import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfx extends cgi<bvy> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.X);
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      if ($$1.bj()) {
         $$1.ea().a(cfc.X, baf.a);
      } else {
         $$1.ea().b(cfc.X);
      }
   }
}
