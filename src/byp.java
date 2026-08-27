import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class byp extends byz<cgc> {
   public static final int a = 24;

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bya.B)));
   }

   protected void a(apa $$0, cgc $$1) {
      super.a($$0, $$1);
      $$1.dM()
         .c(bya.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bok.e)
         .filter($$1x -> bzg.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dM().a(bya.B, $$1x), () -> $$1.dM().b(bya.B));
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
