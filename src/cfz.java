import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cfz extends cgj<cnt> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfk.B)));
   }

   protected void a(ash $$0, cnt $$1) {
      super.a($$0, $$1);
      $$1.ec()
         .c(cfk.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bvp.e)
         .filter($$2 -> cgq.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ec().a(cfk.B, $$1x), () -> $$1.ec().b(cfk.B));
   }
}
