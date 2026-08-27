import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class caw extends cbg<cin> {
   public static final int a = 24;

   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cah.B)));
   }

   protected void a(aqe $$0, cin $$1) {
      super.a($$0, $$1);
      $$1.dQ()
         .c(cah.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bqq.e)
         .filter($$1x -> cbn.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dQ().a(cah.B, $$1x), () -> $$1.dQ().b(cah.B));
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
