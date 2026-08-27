import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cag extends caq<chv> {
   public static final int a = 24;

   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bzr.B)));
   }

   protected void a(aps $$0, chv $$1) {
      super.a($$0, $$1);
      $$1.dP()
         .c(bzr.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bqa.e)
         .filter($$1x -> cax.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dP().a(bzr.B, $$1x), () -> $$1.dP().b(bzr.B));
   }

   @Override
   protected int b() {
      return 24;
   }

   @Override
   protected int c() {
      return 24;
   }
}
