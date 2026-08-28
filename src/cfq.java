import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cfq extends cga<cnk> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cfb.B)));
   }

   protected void a(arx $$0, cnk $$1) {
      super.a($$0, $$1);
      $$1.ec()
         .c(cfb.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bvg.e)
         .filter($$2 -> cgh.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.ec().a(cfb.B, $$1x), () -> $$1.ec().b(cfb.B));
   }
}
