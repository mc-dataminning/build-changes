import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdg extends cdq<ckx> {
   public static final int a = 24;

   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccr.B)));
   }

   protected void a(are $$0, ckx $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(ccr.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsx.e)
         .filter($$1x -> cdx.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(ccr.B, $$1x), () -> $$1.dS().b(ccr.B));
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
