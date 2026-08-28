import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cda extends cdl<btb> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.X);
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      if ($$1.bf()) {
         $$1.dU().a(ccf.X, azk.a);
      } else {
         $$1.dU().b(ccf.X);
      }
   }
}
