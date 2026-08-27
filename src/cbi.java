import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbi extends cbn<bre> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.h, cah.M, cah.an);
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      bsf<?> $$2 = $$1.dQ();
      List<cja> $$3 = Lists.newArrayList();
      caj $$4 = $$2.c(cah.h).orElse(caj.a());
      Optional<brg> $$5 = $$4.a($$0x -> $$0x instanceof cii || $$0x instanceof cgj).map(brg.class::cast);

      for (bre $$7 : $$2.c(cah.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cja && ((cja)$$7).gq()) {
            $$3.add((cja)$$7);
         }
      }

      $$2.a(cah.M, $$5);
      $$2.a(cah.an, $$3);
   }
}
