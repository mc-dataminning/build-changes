import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdl extends cdy<clg> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.h, ccs.aw, ccs.aq, ccs.ap, ccs.as, ccs.at, new ccs[0]);
   }

   protected void a(are $$0, clg $$1) {
      buq<?> $$2 = $$1.dS();
      $$2.a(ccs.aw, this.b($$0, $$1));
      Optional<clm> $$3 = Optional.empty();
      int $$4 = 0;
      List<clg> $$5 = Lists.newArrayList();
      ccu $$6 = $$2.c(ccs.h).orElse(ccu.a());

      for (bto $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof clm || $$0x instanceof clg))) {
         if ($$7 instanceof clm $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clg $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccs.aq, $$3);
      $$2.a(ccs.ap, $$5);
      $$2.a(ccs.as, $$4);
      $$2.a(ccs.at, $$5.size());
   }

   private Optional<iz> b(are $$0, clg $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(awo.aS));
   }
}
