import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bpu extends bqf<bfz> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.x, bpb.y);
   }

   @Override
   protected void a(aif $$0, bfz $$1) {
      bha<?> $$2 = $$1.dK();
      ben $$3 = $$1.et();
      if ($$3 != null) {
         $$2.a(bpb.x, $$1.et());
         bfj $$4 = $$3.d();
         if ($$4 instanceof bfz) {
            $$2.a(bpb.y, (bfz)$$4);
         }
      } else {
         $$2.b(bpb.x);
      }

      $$2.c(bpb.y).ifPresent($$2x -> {
         if (!$$2x.bs() || $$2x.dI() != $$0) {
            $$2.b(bpb.y);
         }
      });
   }
}
