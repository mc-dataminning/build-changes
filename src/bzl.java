import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bzl extends byz<che> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bya.B)));
   }

   protected void a(apa $$0, che $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bol.bw)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bol.bw))
         .ifPresentOrElse($$1x -> $$1.dM().a(bya.B, $$1x), () -> $$1.dM().b(bya.B));
   }

   private static Optional<box> a(che $$0, Predicate<box> $$1) {
      return $$0.dM().c(bya.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
