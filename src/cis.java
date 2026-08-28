import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cis extends cig<crl> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(chh.C)));
   }

   protected void a(asb $$0, crl $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.an() == bxn.bT)
         .or(() -> a($$1, $$0xx -> $$0xx.an() != bxn.bT))
         .ifPresentOrElse($$1x -> $$1.ec().a(chh.C, $$1x), () -> $$1.ec().b(chh.C));
   }

   private static Optional<byf> a(crl $$0, Predicate<byf> $$1) {
      return $$0.ec().c(chh.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
