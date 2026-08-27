import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btb extends btg<bjb> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.h, bsc.L, bsc.am);
   }

   @Override
   protected void a(akn $$0, bjb $$1) {
      bkb<?> $$2 = $$1.dM();
      List<cae> $$3 = Lists.newArrayList();
      bse $$4 = $$2.c(bsc.h).orElse(bse.a());
      Optional<bjd> $$5 = $$4.a($$0x -> $$0x instanceof bzu || $$0x instanceof bxw).map(bjd.class::cast);

      for (bjb $$7 : $$2.c(bsc.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cae && ((cae)$$7).gb()) {
            $$3.add((cae)$$7);
         }
      }

      $$2.a(bsc.L, $$5);
      $$2.a(bsc.am, $$3);
   }
}
