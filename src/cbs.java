import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cbs extends cbg<cjp> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cah.B)));
   }

   protected void a(aqe $$0, cjp $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bqr.bx)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bqr.bx))
         .ifPresentOrElse($$1x -> $$1.dQ().a(cah.B, $$1x), () -> $$1.dQ().b(cah.B));
   }

   private static Optional<bre> a(cjp $$0, Predicate<bre> $$1) {
      return $$0.dQ().c(cah.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
