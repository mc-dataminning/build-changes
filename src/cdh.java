import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdh extends cdm<btc> {
   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.h, ccg.M, ccg.an);
   }

   @Override
   protected void a(aqm $$0, btc $$1) {
      bue<?> $$2 = $$1.dV();
      List<cla> $$3 = Lists.newArrayList();
      cci $$4 = $$2.c(ccg.h).orElse(cci.a());
      Optional<bte> $$5 = $$4.a($$0x -> $$0x instanceof cki || $$0x instanceof cii).map(bte.class::cast);

      for (btc $$7 : $$2.c(ccg.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cla && ((cla)$$7).go()) {
            $$3.add((cla)$$7);
         }
      }

      $$2.a(ccg.M, $$5);
      $$2.a(ccg.an, $$3);
   }
}
