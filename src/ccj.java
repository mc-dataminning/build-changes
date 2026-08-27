import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ccj extends cct<cka> {
   public static final int a = 24;

   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbu.B)));
   }

   protected void a(aqn $$0, cka $$1) {
      super.a($$0, $$1);
      $$1.dS()
         .c(cbu.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsb.e)
         .filter($$1x -> cda.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dS().a(cbu.B, $$1x), () -> $$1.dS().b(cbu.B));
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
