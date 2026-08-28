import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cfu extends cfi<cnx> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cej.B)));
   }

   protected void a(arc $$0, cnx $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == buq.bR)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != buq.bR))
         .ifPresentOrElse($$1x -> $$1.ec().a(cej.B, $$1x), () -> $$1.ec().b(cej.B));
   }

   private static Optional<bvf> a(cnx $$0, Predicate<bvf> $$1) {
      return $$0.ec().c(cej.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
