import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buy extends bvd<bky> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.h, btz.L, btz.am);
   }

   @Override
   protected void a(ama $$0, bky $$1) {
      bly<?> $$2 = $$1.dN();
      List<ccb> $$3 = Lists.newArrayList();
      bub $$4 = $$2.c(btz.h).orElse(bub.a());
      Optional<bla> $$5 = $$4.a($$0x -> $$0x instanceof cbr || $$0x instanceof bzt).map(bla.class::cast);

      for (bky $$7 : $$2.c(btz.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof ccb && ((ccb)$$7).gf()) {
            $$3.add((ccb)$$7);
         }
      }

      $$2.a(btz.L, $$5);
      $$2.a(btz.am, $$3);
   }
}
