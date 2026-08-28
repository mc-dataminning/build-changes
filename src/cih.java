import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cih extends chv<cra> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgw.C)));
   }

   protected void a(ars $$0, cra $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.an() == bxc.bT)
         .or(() -> a($$1, $$0xx -> $$0xx.an() != bxc.bT))
         .ifPresentOrElse($$1x -> $$1.ec().a(cgw.C, $$1x), () -> $$1.ec().b(cgw.C));
   }

   private static Optional<bxu> a(cra $$0, Predicate<bxu> $$1) {
      return $$0.ec().c(cgw.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
