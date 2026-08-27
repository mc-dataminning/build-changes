import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bpo extends bqf<bfe> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.J, bpb.h);
   }

   protected void a(aif $$0, bfe $$1) {
      $$1.dK().c(bpb.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bfe $$0, bpd $$1) {
      Optional<bfe> $$2 = $$1.a($$1x -> $$1x.ae() == $$0.ae() && !$$1x.h_()).map(bfe.class::cast);
      $$0.dK().a(bpb.J, $$2);
   }
}
