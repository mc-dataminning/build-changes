import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cgt extends chd<cow> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cge.C)));
   }

   protected void a(arq $$0, cow $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cge.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bwk.e)
         .filter($$2 -> chk.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cge.C, $$1x), () -> $$1.eb().b(cge.C));
   }
}
