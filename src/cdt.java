import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdt extends cdy<btn> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.h, ccs.M, ccs.an);
   }

   @Override
   protected void a(aqu $$0, btn $$1) {
      buq<?> $$2 = $$1.dU();
      List<clm> $$3 = Lists.newArrayList();
      ccu $$4 = $$2.c(ccs.h).orElse(ccu.a());
      Optional<btp> $$5 = $$4.a($$0x -> $$0x instanceof cku || $$0x instanceof ciu).map(btp.class::cast);

      for (btn $$7 : $$2.c(ccs.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof clm && ((clm)$$7).gm()) {
            $$3.add((clm)$$7);
         }
      }

      $$2.a(ccs.M, $$5);
      $$2.a(ccs.an, $$3);
   }
}
