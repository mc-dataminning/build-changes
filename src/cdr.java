import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cdr extends cdf<clp> {
   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccg.B)));
   }

   protected void a(aqm $$0, clp $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.am() == bsn.by)
         .or(() -> a($$1, $$0xx -> $$0xx.am() != bsn.by))
         .ifPresentOrElse($$1x -> $$1.dV().a(ccg.B, $$1x), () -> $$1.dV().b(ccg.B));
   }

   private static Optional<btc> a(clp $$0, Predicate<btc> $$1) {
      return $$0.dV().c(ccg.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
