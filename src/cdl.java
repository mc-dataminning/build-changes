import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdl extends cdw<btl> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.X);
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      if ($$1.bf()) {
         $$1.dU().a(ccq.X, azr.a);
      } else {
         $$1.dU().b(ccq.X);
      }
   }
}
