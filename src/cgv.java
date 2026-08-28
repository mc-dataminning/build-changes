import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cgv extends chf<cpa> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgg.C)));
   }

   protected void a(arq $$0, cpa $$1) {
      super.a($$0, $$1);
      $$1.ec()
         .c(cgg.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bwm.e)
         .filter($$2 -> chm.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ec().a(cgg.C, $$1x), () -> $$1.ec().b(cgg.C));
   }
}
