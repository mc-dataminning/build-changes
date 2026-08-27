import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzt extends bzy<bpp> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.h, bys.M, bys.an);
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      bqq<?> $$2 = $$1.dP();
      List<chj> $$3 = Lists.newArrayList();
      byu $$4 = $$2.c(bys.h).orElse(byu.a());
      Optional<bpr> $$5 = $$4.a($$0x -> $$0x instanceof cgr || $$0x instanceof ces).map(bpr.class::cast);

      for (bpp $$7 : $$2.c(bys.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof chj && ((chj)$$7).go()) {
            $$3.add((chj)$$7);
         }
      }

      $$2.a(bys.M, $$5);
      $$2.a(bys.an, $$3);
   }
}
