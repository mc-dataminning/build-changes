import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cad extends bzr<chy> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bys.B)));
   }

   protected void a(apf $$0, chy $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ai() == bpd.by)
         .or(() -> a($$1, $$0xx -> $$0xx.ai() != bpd.by))
         .ifPresentOrElse($$1x -> $$1.dP().a(bys.B, $$1x), () -> $$1.dP().b(bys.B));
   }

   private static Optional<bpp> a(chy $$0, Predicate<bpp> $$1) {
      return $$0.dP().c(bys.g).stream().flatMap(Collection::stream).filter($$0::b).filter($$1).findFirst();
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
