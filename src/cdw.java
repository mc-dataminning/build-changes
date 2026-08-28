import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdw extends ceb<btr> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.h, ccv.M, ccv.an);
   }

   @Override
   protected void a(arf $$0, btr $$1) {
      but<?> $$2 = $$1.dS();
      List<clo> $$3 = Lists.newArrayList();
      ccx $$4 = $$2.c(ccv.h).orElse(ccx.a());
      Optional<btt> $$5 = $$4.a($$0x -> $$0x instanceof ckw || $$0x instanceof cix).map(btt.class::cast);

      for (btr $$7 : $$2.c(ccv.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof clo && ((clo)$$7).gr()) {
            $$3.add((clo)$$7);
         }
      }

      $$2.a(ccv.M, $$5);
      $$2.a(ccv.an, $$3);
   }
}
