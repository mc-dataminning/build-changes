import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cex extends cfh<cmr> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cei.B)));
   }

   protected void a(arq $$0, cmr $$1) {
      super.a($$0, $$1);
      $$1.ee()
         .c(cei.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bun.e)
         .filter($$1x -> cfo.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ee().a(cei.B, $$1x), () -> $$1.ee().b(cei.B));
   }
}
