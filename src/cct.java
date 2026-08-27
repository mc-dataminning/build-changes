import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cct extends ccy<bso> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.h, cbs.M, cbs.an);
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      btq<?> $$2 = $$1.dS();
      List<ckl> $$3 = Lists.newArrayList();
      cbu $$4 = $$2.c(cbs.h).orElse(cbu.a());
      Optional<bsq> $$5 = $$4.a($$0x -> $$0x instanceof cjt || $$0x instanceof chu).map(bsq.class::cast);

      for (bso $$7 : $$2.c(cbs.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof ckl && ((ckl)$$7).gq()) {
            $$3.add((ckl)$$7);
         }
      }

      $$2.a(cbs.M, $$5);
      $$2.a(cbs.an, $$3);
   }
}
