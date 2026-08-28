import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccz extends cdm<ckv> {
   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.h, ccg.aw, ccg.aq, ccg.ap, ccg.as, ccg.at, new ccg[0]);
   }

   protected void a(aqm $$0, ckv $$1) {
      bue<?> $$2 = $$1.dV();
      $$2.a(ccg.aw, this.b($$0, $$1));
      Optional<clb> $$3 = Optional.empty();
      int $$4 = 0;
      List<ckv> $$5 = Lists.newArrayList();
      cci $$6 = $$2.c(ccg.h).orElse(cci.a());

      for (btc $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof clb || $$0x instanceof ckv))) {
         if ($$7 instanceof clb $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof ckv $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccg.aq, $$3);
      $$2.a(ccg.ap, $$5);
      $$2.a(ccg.as, $$4);
      $$2.a(ccg.at, $$5.size());
   }

   private Optional<ja> b(aqm $$0, ckv $$1) {
      return ja.a($$1.dr(), 8, 4, $$1x -> $$0.a_($$1x).a(avw.aS));
   }
}
