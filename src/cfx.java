import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cfx extends cfl<coa> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cem.B)));
   }

   protected void a(ard $$0, coa $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == but.bR)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != but.bR))
         .ifPresentOrElse($$1x -> $$1.eb().a(cem.B, $$1x), () -> $$1.eb().b(cem.B));
   }

   private static Optional<bvi> a(coa $$0, Predicate<bvi> $$1) {
      return $$0.eb().c(cem.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
