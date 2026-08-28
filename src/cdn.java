import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdn extends cea<cli> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.h, ccu.aw, ccu.aq, ccu.ap, ccu.as, ccu.at, new ccu[0]);
   }

   protected void a(arf $$0, cli $$1) {
      bus<?> $$2 = $$1.dS();
      $$2.a(ccu.aw, this.b($$0, $$1));
      Optional<clo> $$3 = Optional.empty();
      int $$4 = 0;
      List<cli> $$5 = Lists.newArrayList();
      ccw $$6 = $$2.c(ccu.h).orElse(ccw.a());

      for (btq $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof clo || $$0x instanceof cli))) {
         if ($$7 instanceof clo $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cli $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccu.aq, $$3);
      $$2.a(ccu.ap, $$5);
      $$2.a(ccu.as, $$4);
      $$2.a(ccu.at, $$5.size());
   }

   private Optional<iz> b(arf $$0, cli $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(awp.aS));
   }
}
