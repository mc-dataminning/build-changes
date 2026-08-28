import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cfa extends cfk<cmu> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cel.B)));
   }

   protected void a(ard $$0, cmu $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cel.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(buq.e)
         .filter($$2 -> cfr.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cel.B, $$1x), () -> $$1.eb().b(cel.B));
   }
}
