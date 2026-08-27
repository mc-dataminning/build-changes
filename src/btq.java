import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class btq extends bte<cay> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bsh.B)));
   }

   protected void a(akr $$0, cay $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ah() == biu.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ah() != biu.bt))
         .ifPresentOrElse($$1x -> $$1.dN().a(bsh.B, $$1x), () -> $$1.dN().b(bsh.B));
   }

   private static Optional<bjg> a(cay $$0, Predicate<bjg> $$1) {
      return $$0.dN().c(bsh.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
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
