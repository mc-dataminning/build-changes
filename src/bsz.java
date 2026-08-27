import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsz extends bte<biy> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.h, bsa.L, bsa.am);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      bjz<?> $$2 = $$1.dM();
      List<cac> $$3 = Lists.newArrayList();
      bsc $$4 = $$2.c(bsa.h).orElse(bsc.a());
      Optional<bja> $$5 = $$4.a($$0x -> $$0x instanceof bzs || $$0x instanceof bxu).map(bja.class::cast);

      for (biy $$7 : $$2.c(bsa.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cac && ((cac)$$7).ga()) {
            $$3.add((cac)$$7);
         }
      }

      $$2.a(bsa.L, $$5);
      $$2.a(bsa.am, $$3);
   }
}
