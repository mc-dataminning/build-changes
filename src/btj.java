import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class btj extends bsx<car> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bsa.B)));
   }

   protected void a(akk $$0, car $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == bim.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != bim.bt))
         .ifPresentOrElse($$1x -> $$1.dM().a(bsa.B, $$1x), () -> $$1.dM().b(bsa.B));
   }

   private static Optional<biy> a(car $$0, Predicate<biy> $$1) {
      return $$0.dM().c(bsa.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
