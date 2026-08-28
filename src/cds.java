import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cds extends cdx<btn> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.h, ccr.M, ccr.an);
   }

   @Override
   protected void a(are $$0, btn $$1) {
      bup<?> $$2 = $$1.dS();
      List<clk> $$3 = Lists.newArrayList();
      cct $$4 = $$2.c(ccr.h).orElse(cct.a());
      Optional<btp> $$5 = $$4.a($$0x -> $$0x instanceof cks || $$0x instanceof cit).map(btp.class::cast);

      for (btn $$7 : $$2.c(ccr.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof clk && ((clk)$$7).gr()) {
            $$3.add((clk)$$7);
         }
      }

      $$2.a(ccr.M, $$5);
      $$2.a(ccr.an, $$3);
   }
}
