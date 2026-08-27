import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cba extends cbn<civ> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.h, cah.aw, cah.aq, cah.ap, cah.as, cah.at, new cah[0]);
   }

   protected void a(aqe $$0, civ $$1) {
      bsf<?> $$2 = $$1.dQ();
      $$2.a(cah.aw, this.b($$0, $$1));
      Optional<cjb> $$3 = Optional.empty();
      int $$4 = 0;
      List<civ> $$5 = Lists.newArrayList();
      caj $$6 = $$2.c(cah.h).orElse(caj.a());

      for (bre $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cjb || $$0x instanceof civ))) {
         if ($$7 instanceof cjb $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof civ $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cah.aq, $$3);
      $$2.a(cah.ap, $$5);
      $$2.a(cah.as, $$4);
      $$2.a(cah.at, $$5.size());
   }

   private Optional<im> b(aqe $$0, civ $$1) {
      return im.a($$1.dn(), 8, 4, $$1x -> $$0.a_($$1x).a(avo.aS));
   }
}
