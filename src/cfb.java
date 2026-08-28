import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cfb extends cfl<cmv> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cem.B)));
   }

   protected void a(ard $$0, cmv $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cem.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bur.e)
         .filter($$2 -> cfs.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cem.B, $$1x), () -> $$1.eb().b(cem.B));
   }
}
