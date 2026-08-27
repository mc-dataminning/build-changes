import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bxb extends bwp<ceu> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bvq.B)));
   }

   protected void a(ane $$0, ceu $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bmc.bw)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bmc.bw))
         .ifPresentOrElse($$1x -> $$1.dN().a(bvq.B, $$1x), () -> $$1.dN().b(bvq.B));
   }

   private static Optional<bmo> a(ceu $$0, Predicate<bmo> $$1) {
      return $$0.dN().c(bvq.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
   }

   @Override
   protected int b() {
      return 24;
   }

   @Override
   protected int c() {
      return 24;
   }
}
