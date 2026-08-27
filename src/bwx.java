import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bwx extends bwl<cem> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bvn.B)));
   }

   protected void a(and $$0, cem $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == blz.bv)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != blz.bv))
         .ifPresentOrElse($$1x -> $$1.dO().a(bvn.B, $$1x), () -> $$1.dO().b(bvn.B));
   }

   private static Optional<bml> a(cem $$0, Predicate<bml> $$1) {
      return $$0.dO().c(bvn.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
