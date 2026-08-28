import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class chm extends cha<cpv> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgb.C)));
   }

   protected void a(aro $$0, cpv $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.aq() == bwj.bS)
         .or(() -> a($$1, $$0xx -> $$0xx.aq() != bwj.bS))
         .ifPresentOrElse($$1x -> $$1.eb().a(cgb.C, $$1x), () -> $$1.eb().b(cgb.C));
   }

   private static Optional<bwz> a(cpv $$0, Predicate<bwz> $$1) {
      return $$0.eb().c(cgb.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
   }
}
