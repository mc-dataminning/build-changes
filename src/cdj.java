import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdj extends cdw<clf> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.h, ccq.aw, ccq.aq, ccq.ap, ccq.as, ccq.at, new ccq[0]);
   }

   protected void a(aqt $$0, clf $$1) {
      buo<?> $$2 = $$1.dU();
      $$2.a(ccq.aw, this.b($$0, $$1));
      Optional<cll> $$3 = Optional.empty();
      int $$4 = 0;
      List<clf> $$5 = Lists.newArrayList();
      ccs $$6 = $$2.c(ccq.h).orElse(ccs.a());

      for (btl $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cll || $$0x instanceof clf))) {
         if ($$7 instanceof cll $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clf $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccq.aq, $$3);
      $$2.a(ccq.ap, $$5);
      $$2.a(ccq.as, $$4);
      $$2.a(ccq.at, $$5.size());
   }

   private Optional<jd> b(aqt $$0, clf $$1) {
      return jd.a($$1.dq(), 8, 4, $$1x -> $$0.a_($$1x).a(awd.aS));
   }
}
