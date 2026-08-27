import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bvi extends buw<ccq> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(btz.B)));
   }

   protected void a(ama $$0, ccq $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == bkm.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != bkm.bt))
         .ifPresentOrElse($$1x -> $$1.dN().a(btz.B, $$1x), () -> $$1.dN().b(btz.B));
   }

   private static Optional<bky> a(ccq $$0, Predicate<bky> $$1) {
      return $$0.dN().c(btz.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
