import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzk extends bzx<chc> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.h, byr.aw, byr.aq, byr.ap, byr.as, byr.at, new byr[0]);
   }

   protected void a(apf $$0, chc $$1) {
      bqp<?> $$2 = $$1.dP();
      $$2.a(byr.aw, this.b($$0, $$1));
      Optional<chi> $$3 = Optional.empty();
      int $$4 = 0;
      List<chc> $$5 = Lists.newArrayList();
      byt $$6 = $$2.c(byr.h).orElse(byt.a());

      for (bpo $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof chi || $$0x instanceof chc))) {
         if ($$7 instanceof chi $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof chc $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(byr.aq, $$3);
      $$2.a(byr.ap, $$5);
      $$2.a(byr.as, $$4);
      $$2.a(byr.at, $$5.size());
   }

   private Optional<ib> b(apf $$0, chc $$1) {
      return ib.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(aun.aS));
   }
}
