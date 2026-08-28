import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cdh extends cdr<ckz> {
   public static final int a = 24;

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(ccs.B)));
   }

   protected void a(aqu $$0, ckz $$1) {
      super.a($$0, $$1);
      $$1.dU()
         .c(ccs.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsw.e)
         .filter($$1x -> cdy.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dU().a(ccs.B, $$1x), () -> $$1.dU().b(ccs.B));
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
