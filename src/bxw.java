import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bxw extends byg<cfj> {
   public static final int a = 24;

   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bxh.B)));
   }

   protected void a(aov $$0, cfj $$1) {
      super.a($$0, $$1);
      $$1.dO()
         .c(bxh.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bnt.e)
         .filter($$1x -> byn.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dO().a(bxh.B, $$1x), () -> $$1.dO().b(bxh.B));
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
