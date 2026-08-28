import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgd extends cgq<cof> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.h, cfk.aw, cfk.aq, cfk.ap, cfk.as, cfk.at, new cfk[0]);
   }

   protected void a(ash $$0, cof $$1) {
      bxi<?> $$2 = $$1.ec();
      $$2.a(cfk.aw, this.b($$0, $$1));
      Optional<col> $$3 = Optional.empty();
      int $$4 = 0;
      List<cof> $$5 = Lists.newArrayList();
      cfm $$6 = $$2.c(cfk.h).orElse(cfm.a());

      for (bwg $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof col || $$0x instanceof cof))) {
         if ($$7 instanceof col $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cof $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cfk.aq, $$3);
      $$2.a(cfk.ap, $$5);
      $$2.a(cfk.as, $$4);
      $$2.a(cfk.at, $$5.size());
   }

   private Optional<jh> b(ash $$0, cof $$1) {
      return jh.a($$1.dw(), 8, 4, $$1x -> $$0.a_($$1x).a(axu.aU));
   }
}
