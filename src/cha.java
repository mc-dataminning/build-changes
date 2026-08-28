import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cha extends chk<cph> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgl.C)));
   }

   protected void a(arq $$0, cph $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cgl.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bwp.e)
         .filter($$2 -> chr.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cgl.C, $$1x), () -> $$1.eb().b(cgl.C));
   }
}
