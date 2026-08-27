import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bww extends bwk<cel> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bvm.B)));
   }

   protected void a(and $$0, cel $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bly.bv)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bly.bv))
         .ifPresentOrElse($$1x -> $$1.dO().a(bvm.B, $$1x), () -> $$1.dO().b(bvm.B));
   }

   private static Optional<bmk> a(cel $$0, Predicate<bmk> $$1) {
      return $$0.dO().c(bvm.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
