import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwn extends bws<bml> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.h, bvn.L, bvn.am);
   }

   @Override
   protected void a(and $$0, bml $$1) {
      bnl<?> $$2 = $$1.dO();
      List<cdx> $$3 = Lists.newArrayList();
      bvp $$4 = $$2.c(bvn.h).orElse(bvp.a());
      Optional<bmn> $$5 = $$4.a($$0x -> $$0x instanceof cdg || $$0x instanceof cbi).map(bmn.class::cast);

      for (bml $$7 : $$2.c(bvn.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cdx && ((cdx)$$7).gf()) {
            $$3.add((cdx)$$7);
         }
      }

      $$2.a(bvn.L, $$5);
      $$2.a(bvn.am, $$3);
   }
}
