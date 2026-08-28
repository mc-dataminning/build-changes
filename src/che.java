import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class che extends cgs<cpl> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cft.C)));
   }

   protected void a(arn $$0, cpl $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bwb.bR)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bwb.bR))
         .ifPresentOrElse($$1x -> $$1.eb().a(cft.C, $$1x), () -> $$1.eb().b(cft.C));
   }

   private static Optional<bwr> a(cpl $$0, Predicate<bwr> $$1) {
      return $$0.eb().c(cft.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
