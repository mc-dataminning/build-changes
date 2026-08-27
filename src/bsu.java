import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bsu extends btl<bil> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.J, bsh.h);
   }

   protected void a(akr $$0, bil $$1) {
      $$1.dN().c(bsh.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bil $$0, bsj $$1) {
      Optional<bil> $$2 = $$1.a($$1x -> $$1x.ah() == $$0.ah() && !$$1x.m_()).map(bil.class::cast);
      $$0.dN().a(bsh.J, $$2);
   }
}
