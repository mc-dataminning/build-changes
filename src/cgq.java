import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cgq extends cha<coq> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cgb.C)));
   }

   protected void a(aro $$0, coq $$1) {
      super.a($$0, $$1);
      $$1.eb()
         .c(cgb.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bwh.e)
         .filter($$2 -> chh.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eb().a(cgb.C, $$1x), () -> $$1.eb().b(cgb.C));
   }
}
