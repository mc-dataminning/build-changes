import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdo extends ceb<clj> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.h, ccv.aw, ccv.aq, ccv.ap, ccv.as, ccv.at, new ccv[0]);
   }

   protected void a(arf $$0, clj $$1) {
      but<?> $$2 = $$1.dS();
      $$2.a(ccv.aw, this.b($$0, $$1));
      Optional<clp> $$3 = Optional.empty();
      int $$4 = 0;
      List<clj> $$5 = Lists.newArrayList();
      ccx $$6 = $$2.c(ccv.h).orElse(ccx.a());

      for (btr $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof clp || $$0x instanceof clj))) {
         if ($$7 instanceof clp $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clj $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccv.aq, $$3);
      $$2.a(ccv.ap, $$5);
      $$2.a(ccv.as, $$4);
      $$2.a(ccv.at, $$5.size());
   }

   private Optional<iz> b(arf $$0, clj $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(awp.aS));
   }
}
