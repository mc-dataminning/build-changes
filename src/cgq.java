import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cgq extends cge<cov> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cff.B)));
   }

   protected void a(ash $$0, cov $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bvm.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bvm.bS))
         .ifPresentOrElse($$1x -> $$1.eb().a(cff.B, $$1x), () -> $$1.eb().b(cff.B));
   }

   private static Optional<bwb> a(cov $$0, Predicate<bwb> $$1) {
      return $$0.eb().c(cff.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
