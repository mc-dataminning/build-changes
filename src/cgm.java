import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cgm extends cga<cor> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfb.B)));
   }

   protected void a(arx $$0, cor $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bvi.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bvi.bS))
         .ifPresentOrElse($$1x -> $$1.ec().a(cfb.B, $$1x), () -> $$1.ec().b(cfb.B));
   }

   private static Optional<bvx> a(cor $$0, Predicate<bvx> $$1) {
      return $$0.ec().c(cfb.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
