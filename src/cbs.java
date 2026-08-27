import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cbs extends ccc<cjj> {
   public static final int a = 24;

   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cbd.B)));
   }

   protected void a(aqh $$0, cjj $$1) {
      super.a($$0, $$1);
      $$1.dQ()
         .c(cbd.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(brm.e)
         .filter($$1x -> ccj.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dQ().a(cbd.B, $$1x), () -> $$1.dQ().b(cbd.B));
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
