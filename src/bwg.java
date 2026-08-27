import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwg extends bws<cds> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.h, bvn.av, bvn.ap, bvn.ao, bvn.ar, bvn.as, new bvn[0]);
   }

   protected void a(and $$0, cds $$1) {
      bnl<?> $$2 = $$1.dO();
      $$2.a(bvn.av, this.b($$0, $$1));
      Optional<cdy> $$3 = Optional.empty();
      int $$4 = 0;
      List<cds> $$5 = Lists.newArrayList();
      bvp $$6 = $$2.c(bvn.h).orElse(bvp.a());

      for (bml $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cdy || $$0x instanceof cds))) {
         if ($$7 instanceof cdy $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cds $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bvn.ap, $$3);
      $$2.a(bvn.ao, $$5);
      $$2.a(bvn.ar, $$4);
      $$2.a(bvn.as, $$5.size());
   }

   private Optional<hx> b(and $$0, cds $$1) {
      return hx.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(ash.aR));
   }
}
