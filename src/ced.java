import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class ced extends cdr<cmb> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccs.B)));
   }

   protected void a(aqu $$0, cmb $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.am() == bsx.by)
         .or(() -> a($$1, $$0xx -> $$0xx.am() != bsx.by))
         .ifPresentOrElse($$1x -> $$1.dU().a(ccs.B, $$1x), () -> $$1.dU().b(ccs.B));
   }

   private static Optional<btn> a(cmb $$0, Predicate<btn> $$1) {
      return $$0.dU().c(ccs.g).stream().flatMap(Collection::stream).filter($$0::c).filter($$1).findFirst();
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
