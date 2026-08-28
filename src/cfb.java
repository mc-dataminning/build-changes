import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cfb extends cep<cnb> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cdq.B)));
   }

   protected void a(arj $$0, cnb $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ao() == bty.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ao() != bty.by))
         .ifPresentOrElse($$1x -> $$1.dY().a(cdq.B, $$1x), () -> $$1.dY().b(cdq.B));
   }

   private static Optional<bun> a(cnb $$0, Predicate<bun> $$1) {
      return $$0.dY().c(cdq.g).stream().flatMap(Collection::stream).filter($$0::c).filter($$1).findFirst();
   }
}
