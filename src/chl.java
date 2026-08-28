import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class chl extends chv<cpv> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgw.C)));
   }

   protected void a(ars $$0, cpv $$1) {
      super.a($$0, $$1);
      $$1.ec()
         .c(cgw.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bxa.e)
         .filter($$2 -> cic.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ec().a(cgw.C, $$1x), () -> $$1.ec().b(cgw.C));
   }
}
