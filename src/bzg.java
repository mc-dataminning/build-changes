import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bzg extends bzq<cgu> {
   public static final int a = 24;

   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(byr.B)));
   }

   protected void a(apf $$0, cgu $$1) {
      super.a($$0, $$1);
      $$1.dP()
         .c(byr.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bpb.e)
         .filter($$1x -> bzx.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dP().a(byr.B, $$1x), () -> $$1.dP().b(byr.B));
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
