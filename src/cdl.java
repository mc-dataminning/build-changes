import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdl extends cdy<clh> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.h, ccs.aw, ccs.aq, ccs.ap, ccs.as, ccs.at, new ccs[0]);
   }

   protected void a(aqu $$0, clh $$1) {
      buq<?> $$2 = $$1.dT();
      $$2.a(ccs.aw, this.b($$0, $$1));
      Optional<cln> $$3 = Optional.empty();
      int $$4 = 0;
      List<clh> $$5 = Lists.newArrayList();
      ccu $$6 = $$2.c(ccs.h).orElse(ccu.a());

      for (btn $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cln || $$0x instanceof clh))) {
         if ($$7 instanceof cln $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clh $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccs.aq, $$3);
      $$2.a(ccs.ap, $$5);
      $$2.a(ccs.as, $$4);
      $$2.a(ccs.at, $$5.size());
   }

   private Optional<jd> b(aqu $$0, clh $$1) {
      return jd.a($$1.do(), 8, 4, $$1x -> $$0.a_($$1x).a(awe.aT));
   }
}
