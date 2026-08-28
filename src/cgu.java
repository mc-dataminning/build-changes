import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgu extends cgz<bwr> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.h, cft.N, cft.ao);
   }

   @Override
   protected void a(arn $$0, bwr $$1) {
      bxr<?> $$2 = $$1.eb();
      List<cow> $$3 = Lists.newArrayList();
      cfv $$4 = $$2.c(cft.h).orElse(cfv.a());
      Optional<bwt> $$5 = $$4.a($$0x -> $$0x instanceof coa || $$0x instanceof cma).map(bwt.class::cast);

      for (bwr $$7 : $$2.c(cft.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cow && ((cow)$$7).t()) {
            $$3.add((cow)$$7);
         }
      }

      $$2.a(cft.N, $$5);
      $$2.a(cft.ao, $$3);
   }
}
