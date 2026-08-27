import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwr extends bww<bmo> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.h, bvq.M, bvq.an);
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      bno<?> $$2 = $$1.dN();
      List<cef> $$3 = Lists.newArrayList();
      bvs $$4 = $$2.c(bvq.h).orElse(bvs.a());
      Optional<bmq> $$5 = $$4.a($$0x -> $$0x instanceof cdn || $$0x instanceof cbp).map(bmq.class::cast);

      for (bmo $$7 : $$2.c(bvq.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cef && ((cef)$$7).gg()) {
            $$3.add((cef)$$7);
         }
      }

      $$2.a(bvq.M, $$5);
      $$2.a(bvq.an, $$3);
   }
}
