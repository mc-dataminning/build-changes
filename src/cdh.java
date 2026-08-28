import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdh extends cdu<clc> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.h, cco.aw, cco.aq, cco.ap, cco.as, cco.at, new cco[0]);
   }

   protected void a(arb $$0, clc $$1) {
      bum<?> $$2 = $$1.dS();
      $$2.a(cco.aw, this.b($$0, $$1));
      Optional<cli> $$3 = Optional.empty();
      int $$4 = 0;
      List<clc> $$5 = Lists.newArrayList();
      ccq $$6 = $$2.c(cco.h).orElse(ccq.a());

      for (btk $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cli || $$0x instanceof clc))) {
         if ($$7 instanceof cli $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clc $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cco.aq, $$3);
      $$2.a(cco.ap, $$5);
      $$2.a(cco.as, $$4);
      $$2.a(cco.at, $$5.size());
   }

   private Optional<iz> b(arb $$0, clc $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(awl.aS));
   }
}
