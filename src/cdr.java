import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdr extends cdw<btl> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.h, ccq.M, ccq.an);
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      buo<?> $$2 = $$1.dU();
      List<clk> $$3 = Lists.newArrayList();
      ccs $$4 = $$2.c(ccq.h).orElse(ccs.a());
      Optional<btn> $$5 = $$4.a($$0x -> $$0x instanceof cks || $$0x instanceof cis).map(btn.class::cast);

      for (btl $$7 : $$2.c(ccq.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof clk && ((clk)$$7).gn()) {
            $$3.add((clk)$$7);
         }
      }

      $$2.a(ccq.M, $$5);
      $$2.a(ccq.an, $$3);
   }
}
