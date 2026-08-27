import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bti extends bsw<caq> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(brz.B)));
   }

   protected void a(akk $$0, caq $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == bim.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != bim.bt))
         .ifPresentOrElse($$1x -> $$1.dM().a(brz.B, $$1x), () -> $$1.dM().b(brz.B));
   }

   private static Optional<biy> a(caq $$0, Predicate<biy> $$1) {
      return $$0.dM().c(brz.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
