import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccy extends cdl<cku> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.h, ccf.aw, ccf.aq, ccf.ap, ccf.as, ccf.at, new ccf[0]);
   }

   protected void a(aqm $$0, cku $$1) {
      bud<?> $$2 = $$1.dU();
      $$2.a(ccf.aw, this.b($$0, $$1));
      Optional<cla> $$3 = Optional.empty();
      int $$4 = 0;
      List<cku> $$5 = Lists.newArrayList();
      cch $$6 = $$2.c(ccf.h).orElse(cch.a());

      for (btb $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cla || $$0x instanceof cku))) {
         if ($$7 instanceof cla $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cku $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccf.aq, $$3);
      $$2.a(ccf.ap, $$5);
      $$2.a(ccf.as, $$4);
      $$2.a(ccf.at, $$5.size());
   }

   private Optional<ja> b(aqm $$0, cku $$1) {
      return ja.a($$1.dq(), 8, 4, $$1x -> $$0.a_($$1x).a(avw.aS));
   }
}
