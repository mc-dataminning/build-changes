import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsx extends btc<biw> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.h, bry.L, bry.am);
   }

   @Override
   protected void a(aki $$0, biw $$1) {
      bjx<?> $$2 = $$1.dM();
      List<caa> $$3 = Lists.newArrayList();
      bsa $$4 = $$2.c(bry.h).orElse(bsa.a());
      Optional<biy> $$5 = $$4.a($$0x -> $$0x instanceof bzq || $$0x instanceof bxs).map(biy.class::cast);

      for (biw $$7 : $$2.c(bry.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof caa && ((caa)$$7).ga()) {
            $$3.add((caa)$$7);
         }
      }

      $$2.a(bry.L, $$5);
      $$2.a(bry.am, $$3);
   }
}
