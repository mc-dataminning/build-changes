import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cgv extends cgj<cpa> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfk.B)));
   }

   protected void a(ash $$0, cpa $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bvr.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bvr.bS))
         .ifPresentOrElse($$1x -> $$1.ec().a(cfk.B, $$1x), () -> $$1.ec().b(cfk.B));
   }

   private static Optional<bwg> a(cpa $$0, Predicate<bwg> $$1) {
      return $$0.ec().c(cfk.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
