import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class ced extends cdr<cma> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccs.B)));
   }

   protected void a(are $$0, cma $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bsz.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bsz.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(ccs.B, $$1x), () -> $$1.dS().b(ccs.B));
   }

   private static Optional<bto> a(cma $$0, Predicate<bto> $$1) {
      return $$0.dS().c(ccs.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
