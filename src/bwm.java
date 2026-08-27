import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwm extends bwr<bmk> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.h, bvm.L, bvm.am);
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      bnk<?> $$2 = $$1.dO();
      List<cdw> $$3 = Lists.newArrayList();
      bvo $$4 = $$2.c(bvm.h).orElse(bvo.a());
      Optional<bmm> $$5 = $$4.a($$0x -> $$0x instanceof cdf || $$0x instanceof cbh).map(bmm.class::cast);

      for (bmk $$7 : $$2.c(bvm.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cdw && ((cdw)$$7).gf()) {
            $$3.add((cdw)$$7);
         }
      }

      $$2.a(bvm.L, $$5);
      $$2.a(bvm.am, $$3);
   }
}
