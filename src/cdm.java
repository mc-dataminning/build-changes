import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdm extends cdz<clh> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.h, cct.aw, cct.aq, cct.ap, cct.as, cct.at, new cct[0]);
   }

   protected void a(arf $$0, clh $$1) {
      bur<?> $$2 = $$1.dS();
      $$2.a(cct.aw, this.b($$0, $$1));
      Optional<cln> $$3 = Optional.empty();
      int $$4 = 0;
      List<clh> $$5 = Lists.newArrayList();
      ccv $$6 = $$2.c(cct.h).orElse(ccv.a());

      for (btp $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cln || $$0x instanceof clh))) {
         if ($$7 instanceof cln $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clh $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cct.aq, $$3);
      $$2.a(cct.ap, $$5);
      $$2.a(cct.as, $$4);
      $$2.a(cct.at, $$5.size());
   }

   private Optional<iz> b(arf $$0, clh $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(awp.aS));
   }
}
