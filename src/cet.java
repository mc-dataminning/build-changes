import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cet extends cfd<cmn> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cee.B)));
   }

   protected void a(arn $$0, cmn $$1) {
      super.a($$0, $$1);
      $$1.ed()
         .c(cee.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(buj.e)
         .filter($$1x -> cfk.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ed().a(cee.B, $$1x), () -> $$1.ed().b(cee.B));
   }
}
