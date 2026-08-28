import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cfu extends cge<cno> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cff.B)));
   }

   protected void a(ash $$0, cno $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cff.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bvk.e)
         .filter($$2 -> cgl.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cff.B, $$1x), () -> $$1.eb().b(cff.B));
   }
}
