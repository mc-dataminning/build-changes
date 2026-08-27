import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccv extends cda<bsq> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.h, cbu.M, cbu.an);
   }

   @Override
   protected void a(aqn $$0, bsq $$1) {
      bts<?> $$2 = $$1.dS();
      List<ckn> $$3 = Lists.newArrayList();
      cbw $$4 = $$2.c(cbu.h).orElse(cbw.a());
      Optional<bss> $$5 = $$4.a($$0x -> $$0x instanceof cjv || $$0x instanceof chw).map(bss.class::cast);

      for (bsq $$7 : $$2.c(cbu.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof ckn && ((ckn)$$7).gq()) {
            $$3.add((ckn)$$7);
         }
      }

      $$2.a(cbu.M, $$5);
      $$2.a(cbu.an, $$3);
   }
}
