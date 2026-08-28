import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ceg extends cet<cme> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.h, cdn.aw, cdn.aq, cdn.ap, cdn.as, cdn.at, new cdn[0]);
   }

   protected void a(arh $$0, cme $$1) {
      bvl<?> $$2 = $$1.dX();
      $$2.a(cdn.aw, this.b($$0, $$1));
      Optional<cmk> $$3 = Optional.empty();
      int $$4 = 0;
      List<cme> $$5 = Lists.newArrayList();
      cdp $$6 = $$2.c(cdn.h).orElse(cdp.a());

      for (buk $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cmk || $$0x instanceof cme))) {
         if ($$7 instanceof cmk $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cme $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cdn.aq, $$3);
      $$2.a(cdn.ap, $$5);
      $$2.a(cdn.as, $$4);
      $$2.a(cdn.at, $$5.size());
   }

   private Optional<je> b(arh $$0, cme $$1) {
      return je.a($$1.ds(), 8, 4, $$1x -> $$0.a_($$1x).a(awt.aT));
   }
}
