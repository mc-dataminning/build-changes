import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvx extends bwc<blv> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.h, bux.L, bux.am);
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      bmv<?> $$2 = $$1.dO();
      List<cdg> $$3 = Lists.newArrayList();
      buz $$4 = $$2.c(bux.h).orElse(buz.a());
      Optional<blx> $$5 = $$4.a($$0x -> $$0x instanceof ccq || $$0x instanceof cas).map(blx.class::cast);

      for (blv $$7 : $$2.c(bux.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cdg && ((cdg)$$7).gf()) {
            $$3.add((cdg)$$7);
         }
      }

      $$2.a(bux.L, $$5);
      $$2.a(bux.am, $$3);
   }
}
