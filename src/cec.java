import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cec extends cdq<clz> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccr.B)));
   }

   protected void a(are $$0, clz $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bsy.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bsy.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(ccr.B, $$1x), () -> $$1.dS().b(ccr.B));
   }

   private static Optional<btn> a(clz $$0, Predicate<btn> $$1) {
      return $$0.dS().c(ccr.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
