import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cbw extends ccj<cjr> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.h, cbd.aw, cbd.aq, cbd.ap, cbd.as, cbd.at, new cbd[0]);
   }

   protected void a(aqh $$0, cjr $$1) {
      btb<?> $$2 = $$1.dQ();
      $$2.a(cbd.aw, this.b($$0, $$1));
      Optional<cjx> $$3 = Optional.empty();
      int $$4 = 0;
      List<cjr> $$5 = Lists.newArrayList();
      cbf $$6 = $$2.c(cbd.h).orElse(cbf.a());

      for (bsa $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cjx || $$0x instanceof cjr))) {
         if ($$7 instanceof cjx $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cjr $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cbd.aq, $$3);
      $$2.a(cbd.ap, $$5);
      $$2.a(cbd.as, $$4);
      $$2.a(cbd.at, $$5.size());
   }

   private Optional<in> b(aqh $$0, cjr $$1) {
      return in.a($$1.dn(), 8, 4, $$1x -> $$0.a_($$1x).a(avr.aS));
   }
}
