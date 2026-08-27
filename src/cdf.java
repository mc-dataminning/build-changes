import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cdf extends cct<clc> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbu.B)));
   }

   protected void a(aqn $$0, clc $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ak() == bsc.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ak() != bsc.by))
         .ifPresentOrElse($$1x -> $$1.dS().a(cbu.B, $$1x), () -> $$1.dS().b(cbu.B));
   }

   private static Optional<bsq> a(clc $$0, Predicate<bsq> $$1) {
      return $$0.dS().c(cbu.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
