import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class chw extends chk<cqp> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgl.C)));
   }

   protected void a(arq $$0, cqp $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.an() == bwr.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.an() != bwr.bS))
         .ifPresentOrElse($$1x -> $$1.eb().a(cgl.C, $$1x), () -> $$1.eb().b(cgl.C));
   }

   private static Optional<bxj> a(cqp $$0, Predicate<bxj> $$1) {
      return $$0.eb().c(cgl.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
