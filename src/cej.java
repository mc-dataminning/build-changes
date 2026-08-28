import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cej extends cew<cmh> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.h, cdq.aw, cdq.aq, cdq.ap, cdq.as, cdq.at, new cdq[0]);
   }

   protected void a(arj $$0, cmh $$1) {
      bvo<?> $$2 = $$1.dY();
      $$2.a(cdq.aw, this.b($$0, $$1));
      Optional<cmn> $$3 = Optional.empty();
      int $$4 = 0;
      List<cmh> $$5 = Lists.newArrayList();
      cds $$6 = $$2.c(cdq.h).orElse(cds.a());

      for (bun $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cmn || $$0x instanceof cmh))) {
         if ($$7 instanceof cmn $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cmh $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cdq.aq, $$3);
      $$2.a(cdq.ap, $$5);
      $$2.a(cdq.as, $$4);
      $$2.a(cdq.at, $$5.size());
   }

   private Optional<jf> b(arj $$0, cmh $$1) {
      return jf.a($$1.ds(), 8, 4, $$1x -> $$0.a_($$1x).a(awv.aT));
   }
}
