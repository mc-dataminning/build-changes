import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwj extends bww<cea> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.h, bvq.aw, bvq.aq, bvq.ap, bvq.as, bvq.at, new bvq[0]);
   }

   protected void a(ane $$0, cea $$1) {
      bno<?> $$2 = $$1.dN();
      $$2.a(bvq.aw, this.b($$0, $$1));
      Optional<ceg> $$3 = Optional.empty();
      int $$4 = 0;
      List<cea> $$5 = Lists.newArrayList();
      bvs $$6 = $$2.c(bvq.h).orElse(bvs.a());

      for (bmo $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof ceg || $$0x instanceof cea))) {
         if ($$7 instanceof ceg $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cea $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bvq.aq, $$3);
      $$2.a(bvq.ap, $$5);
      $$2.a(bvq.as, $$4);
      $$2.a(bvq.at, $$5.size());
   }

   private Optional<hx> b(ane $$0, cea $$1) {
      return hx.a($$1.dl(), 8, 4, $$1x -> $$0.a_($$1x).a(asi.aR));
   }
}
