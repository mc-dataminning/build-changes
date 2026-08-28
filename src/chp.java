import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class chp extends chd<cqb> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cge.C)));
   }

   protected void a(arq $$0, cqb $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bwm.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bwm.bS))
         .ifPresentOrElse($$1x -> $$1.eb().a(cge.C, $$1x), () -> $$1.eb().b(cge.C));
   }

   private static Optional<bxc> a(cqb $$0, Predicate<bxc> $$1) {
      return $$0.eb().c(cge.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
