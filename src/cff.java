import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cff extends cfs<cng> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.h, cem.aw, cem.aq, cem.ap, cem.as, cem.at, new cem[0]);
   }

   protected void a(ard $$0, cng $$1) {
      bwk<?> $$2 = $$1.eb();
      $$2.a(cem.aw, this.b($$0, $$1));
      Optional<cnm> $$3 = Optional.empty();
      int $$4 = 0;
      List<cng> $$5 = Lists.newArrayList();
      ceo $$6 = $$2.c(cem.h).orElse(ceo.a());

      for (bvi $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof cnm || $$0x instanceof cng))) {
         if ($$7 instanceof cnm $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cng $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cem.aq, $$3);
      $$2.a(cem.ap, $$5);
      $$2.a(cem.as, $$4);
      $$2.a(cem.at, $$5.size());
   }

   private Optional<ji> b(ard $$0, cng $$1) {
      return ji.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(awp.aU));
   }
}
