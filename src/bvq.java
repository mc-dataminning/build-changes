import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bvq extends bve<ccy> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(buh.B)));
   }

   protected void a(ame $$0, ccy $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bku.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bku.bt))
         .ifPresentOrElse($$1x -> $$1.dP().a(buh.B, $$1x), () -> $$1.dP().b(buh.B));
   }

   private static Optional<blg> a(ccy $$0, Predicate<blg> $$1) {
      return $$0.dP().c(buh.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
