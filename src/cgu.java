import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cgu extends cgi<coz> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfj.B)));
   }

   protected void a(ash $$0, coz $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bvq.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bvq.bS))
         .ifPresentOrElse($$1x -> $$1.ec().a(cfj.B, $$1x), () -> $$1.ec().b(cfj.B));
   }

   private static Optional<bwf> a(coz $$0, Predicate<bwf> $$1) {
      return $$0.ec().c(cfj.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
