import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bwh extends bvv<cdv> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bux.B)));
   }

   protected void a(amp $$0, cdv $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == blj.bv)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != blj.bv))
         .ifPresentOrElse($$1x -> $$1.dO().a(bux.B, $$1x), () -> $$1.dO().b(bux.B));
   }

   private static Optional<blv> a(cdv $$0, Predicate<blv> $$1) {
      return $$0.dO().c(bux.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
