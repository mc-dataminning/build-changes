import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvq extends bwc<cdb> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.h, bux.av, bux.ap, bux.ao, bux.ar, bux.as, new bux[0]);
   }

   protected void a(amp $$0, cdb $$1) {
      bmv<?> $$2 = $$1.dO();
      $$2.a(bux.av, this.b($$0, $$1));
      Optional<cdh> $$3 = Optional.empty();
      int $$4 = 0;
      List<cdb> $$5 = Lists.newArrayList();
      buz $$6 = $$2.c(bux.h).orElse(buz.a());

      for (blv $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cdh || $$0x instanceof cdb))) {
         if ($$7 instanceof cdh $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cdb $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bux.ap, $$3);
      $$2.a(bux.ao, $$5);
      $$2.a(bux.ar, $$4);
      $$2.a(bux.as, $$5.size());
   }

   private Optional<hv> b(amp $$0, cdb $$1) {
      return hv.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(arr.aR));
   }
}
