import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bsw extends btn<bin> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.J, bsj.h);
   }

   protected void a(aks $$0, bin $$1) {
      $$1.dN().c(bsj.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bin $$0, bsl $$1) {
      Optional<bin> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.m_()).map(bin.class::cast);
      $$0.dN().a(bsj.J, $$2);
   }
}
