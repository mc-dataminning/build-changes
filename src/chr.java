import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class chr extends chf<cqf> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgg.C)));
   }

   protected void a(arq $$0, cqf $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bwo.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bwo.bS))
         .ifPresentOrElse($$1x -> $$1.ec().a(cgg.C, $$1x), () -> $$1.ec().b(cgg.C));
   }

   private static Optional<bxe> a(cqf $$0, Predicate<bxe> $$1) {
      return $$0.ec().c(cgg.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
