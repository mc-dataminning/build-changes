import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class chn extends chx<cpx> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgy.C)));
   }

   protected void a(aru $$0, cpx $$1) {
      super.a($$0, $$1);
      $$1.ec()
         .c(cgy.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bxc.e)
         .filter($$2 -> cie.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ec().a(cgy.C, $$1x), () -> $$1.ec().b(cgy.C));
   }
}
