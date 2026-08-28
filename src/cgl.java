import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgl extends cgq<bwg> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.h, cfk.M, cfk.an);
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      bxi<?> $$2 = $$1.ec();
      List<cok> $$3 = Lists.newArrayList();
      cfm $$4 = $$2.c(cfk.h).orElse(cfm.a());
      Optional<bwi> $$5 = $$4.a($$0x -> $$0x instanceof cno || $$0x instanceof clo).map(bwi.class::cast);

      for (bwg $$7 : $$2.c(cfk.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cok && ((cok)$$7).go()) {
            $$3.add((cok)$$7);
         }
      }

      $$2.a(cfk.M, $$5);
      $$2.a(cfk.an, $$3);
   }
}
