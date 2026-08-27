import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzs extends bzx<bpo> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.h, byr.M, byr.an);
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      bqp<?> $$2 = $$1.dP();
      List<chh> $$3 = Lists.newArrayList();
      byt $$4 = $$2.c(byr.h).orElse(byt.a());
      Optional<bpq> $$5 = $$4.a($$0x -> $$0x instanceof cgp || $$0x instanceof cer).map(bpq.class::cast);

      for (bpo $$7 : $$2.c(byr.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof chh && ((chh)$$7).go()) {
            $$3.add((chh)$$7);
         }
      }

      $$2.a(byr.M, $$5);
      $$2.a(byr.an, $$3);
   }
}
