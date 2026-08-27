import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bya extends byn<cfr> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.h, bxh.aw, bxh.aq, bxh.ap, bxh.as, bxh.at, new bxh[0]);
   }

   protected void a(aov $$0, cfr $$1) {
      bpf<?> $$2 = $$1.dO();
      $$2.a(bxh.aw, this.b($$0, $$1));
      Optional<cfx> $$3 = Optional.empty();
      int $$4 = 0;
      List<cfr> $$5 = Lists.newArrayList();
      bxj $$6 = $$2.c(bxh.h).orElse(bxj.a());

      for (bog $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cfx || $$0x instanceof cfr))) {
         if ($$7 instanceof cfx $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cfr $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bxh.aq, $$3);
      $$2.a(bxh.ap, $$5);
      $$2.a(bxh.as, $$4);
      $$2.a(bxh.at, $$5.size());
   }

   private Optional<hz> b(aov $$0, cfr $$1) {
      return hz.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(atz.aR));
   }
}
