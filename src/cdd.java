import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cdd extends ccr<cla> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbs.B)));
   }

   protected void a(aqm $$0, cla $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bsa.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bsa.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(cbs.B, $$1x), () -> $$1.dS().b(cbs.B));
   }

   private static Optional<bso> a(cla $$0, Predicate<bso> $$1) {
      return $$0.dS().c(cbs.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
