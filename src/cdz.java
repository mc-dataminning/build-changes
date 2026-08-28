import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cdz extends cdn<clw> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cco.B)));
   }

   protected void a(arb $$0, clw $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bsv.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bsv.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(cco.B, $$1x), () -> $$1.dS().b(cco.B));
   }

   private static Optional<btk> a(clw $$0, Predicate<btk> $$1) {
      return $$0.dS().c(cco.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
