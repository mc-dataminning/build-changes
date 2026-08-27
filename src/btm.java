import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btm extends btr<bjm> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.h, bsn.L, bsn.am);
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      bkm<?> $$2 = $$1.dN();
      List<cap> $$3 = Lists.newArrayList();
      bsp $$4 = $$2.c(bsn.h).orElse(bsp.a());
      Optional<bjo> $$5 = $$4.a($$0x -> $$0x instanceof caf || $$0x instanceof byh).map(bjo.class::cast);

      for (bjm $$7 : $$2.c(bsn.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cap && ((cap)$$7).gf()) {
            $$3.add((cap)$$7);
         }
      }

      $$2.a(bsn.L, $$5);
      $$2.a(bsn.am, $$3);
   }
}
