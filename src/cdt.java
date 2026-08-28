import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdt extends cdy<bto> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.h, ccs.M, ccs.an);
   }

   @Override
   protected void a(are $$0, bto $$1) {
      buq<?> $$2 = $$1.dS();
      List<cll> $$3 = Lists.newArrayList();
      ccu $$4 = $$2.c(ccs.h).orElse(ccu.a());
      Optional<btq> $$5 = $$4.a($$0x -> $$0x instanceof ckt || $$0x instanceof ciu).map(btq.class::cast);

      for (bto $$7 : $$2.c(ccs.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cll && ((cll)$$7).gr()) {
            $$3.add((cll)$$7);
         }
      }

      $$2.a(ccs.M, $$5);
      $$2.a(ccs.an, $$3);
   }
}
