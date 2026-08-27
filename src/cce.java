import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cce extends ccj<bsa> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.h, cbd.M, cbd.an);
   }

   @Override
   protected void a(aqh $$0, bsa $$1) {
      btb<?> $$2 = $$1.dQ();
      List<cjw> $$3 = Lists.newArrayList();
      cbf $$4 = $$2.c(cbd.h).orElse(cbf.a());
      Optional<bsc> $$5 = $$4.a($$0x -> $$0x instanceof cje || $$0x instanceof chf).map(bsc.class::cast);

      for (bsa $$7 : $$2.c(cbd.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cjw && ((cjw)$$7).gq()) {
            $$3.add((cjw)$$7);
         }
      }

      $$2.a(cbd.M, $$5);
      $$2.a(cbd.an, $$3);
   }
}
