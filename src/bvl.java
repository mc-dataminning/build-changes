import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvl extends bvq<bll> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.h, bum.L, bum.am);
   }

   @Override
   protected void a(ami $$0, bll $$1) {
      bml<?> $$2 = $$1.dP();
      List<cco> $$3 = Lists.newArrayList();
      buo $$4 = $$2.c(bum.h).orElse(buo.a());
      Optional<bln> $$5 = $$4.a($$0x -> $$0x instanceof cce || $$0x instanceof cag).map(bln.class::cast);

      for (bll $$7 : $$2.c(bum.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cco && ((cco)$$7).gg()) {
            $$3.add((cco)$$7);
         }
      }

      $$2.a(bum.L, $$5);
      $$2.a(bum.am, $$3);
   }
}
