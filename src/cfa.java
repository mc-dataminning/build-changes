import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfa extends cff<buv> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.h, cdz.M, cdz.an);
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      bvx<?> $$2 = $$1.ed();
      List<cmv> $$3 = Lists.newArrayList();
      ceb $$4 = $$2.c(cdz.h).orElse(ceb.a());
      Optional<bux> $$5 = $$4.a($$0x -> $$0x instanceof cmd || $$0x instanceof ckd).map(bux.class::cast);

      for (buv $$7 : $$2.c(cdz.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cmv && ((cmv)$$7).gw()) {
            $$3.add((cmv)$$7);
         }
      }

      $$2.a(cdz.M, $$5);
      $$2.a(cdz.an, $$3);
   }
}
