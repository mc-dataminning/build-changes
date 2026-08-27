import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bzh extends bzr<cgw> {
   public static final int a = 24;

   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bys.B)));
   }

   protected void a(apf $$0, cgw $$1) {
      super.a($$0, $$1);
      $$1.dP()
         .c(bys.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bpc.e)
         .filter($$1x -> bzy.c($$1, $$1x))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.dP().a(bys.B, $$1x), () -> $$1.dP().b(bys.B));
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
