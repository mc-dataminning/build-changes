import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bts extends btg<cba> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bsj.B)));
   }

   protected void a(aks $$0, cba $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ag() == biw.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ag() != biw.bt))
         .ifPresentOrElse($$1x -> $$1.dN().a(bsj.B, $$1x), () -> $$1.dN().b(bsj.B));
   }

   private static Optional<bji> a(cba $$0, Predicate<bji> $$1) {
      return $$0.dN().c(bsj.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
