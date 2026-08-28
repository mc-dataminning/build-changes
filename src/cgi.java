import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cgi extends cgs<cof> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cft.C)));
   }

   protected void a(arn $$0, cof $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cft.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bvz.e)
         .filter($$2 -> cgz.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cft.C, $$1x), () -> $$1.eb().b(cft.C));
   }
}
