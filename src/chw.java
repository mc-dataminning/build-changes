import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class chw extends cig<cqg> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(chh.C)));
   }

   protected void a(asb $$0, cqg $$1) {
      super.a($$0, $$1);
      $$1.ec()
         .c(chh.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bxl.e)
         .filter($$2 -> cin.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ec().a(chh.C, $$1x), () -> $$1.ec().b(chh.C));
   }
}
