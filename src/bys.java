import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bys extends byg<cgl> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bxh.B)));
   }

   protected void a(aov $$0, cgl $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bnu.bw)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bnu.bw))
         .ifPresentOrElse($$1x -> $$1.dO().a(bxh.B, $$1x), () -> $$1.dO().b(bxh.B));
   }

   private static Optional<bog> a(cgl $$0, Predicate<bog> $$1) {
      return $$0.dO().c(bxh.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
