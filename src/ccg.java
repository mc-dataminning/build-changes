import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ccg extends ccq<cka> {
   public static final int a = 24;

   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbr.B)));
   }

   protected void a(aqt $$0, cka $$1) {
      super.a($$0, $$1);
      $$1.dZ()
         .c(cbr.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bsa.e)
         .filter($$1x -> ccx.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dZ().a(cbr.B, $$1x), () -> $$1.dZ().b(cbr.B));
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
