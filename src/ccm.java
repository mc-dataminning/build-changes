import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ccm extends ccx<bso> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.X);
   }

   @Override
   protected void a(aqt $$0, bso $$1) {
      if ($$1.bi()) {
         $$1.dZ().a(cbr.X, azo.a);
      } else {
         $$1.dZ().b(cbr.X);
      }
   }
}
