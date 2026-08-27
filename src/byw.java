import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class byw extends byk<cgp> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bxl.B)));
   }

   protected void a(aow $$0, cgp $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bnw.bw)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bnw.bw))
         .ifPresentOrElse($$1x -> $$1.dO().a(bxl.B, $$1x), () -> $$1.dO().b(bxl.B));
   }

   private static Optional<boi> a(cgp $$0, Predicate<boi> $$1) {
      return $$0.dO().c(bxl.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
