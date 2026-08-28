import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cfr extends cgb<cno> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfc.B)));
   }

   protected void a(ard $$0, cno $$1) {
      super.a($$0, $$1);
      $$1.ea()
         .c(cfc.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bvg.e)
         .filter($$2 -> cgi.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ea().a(cfc.B, $$1x), () -> $$1.ea().b(cfc.B));
   }
}
