import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwh extends bwm<bmf> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.h, bvh.L, bvh.am);
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      bnf<?> $$2 = $$1.dO();
      List<cdq> $$3 = Lists.newArrayList();
      bvj $$4 = $$2.c(bvh.h).orElse(bvj.a());
      Optional<bmh> $$5 = $$4.a($$0x -> $$0x instanceof cda || $$0x instanceof cbc).map(bmh.class::cast);

      for (bmf $$7 : $$2.c(bvh.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cdq && ((cdq)$$7).gf()) {
            $$3.add((cdq)$$7);
         }
      }

      $$2.a(bvh.L, $$5);
      $$2.a(bvh.am, $$3);
   }
}
