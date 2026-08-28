import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cfy extends cgi<cns> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfj.B)));
   }

   protected void a(ash $$0, cns $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cfj.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bvo.e)
         .filter($$2 -> cgp.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cfj.B, $$1x), () -> $$1.eb().b(cfj.B));
   }
}
