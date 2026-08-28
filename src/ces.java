import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ces extends cff<cmq> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.h, cdz.aw, cdz.aq, cdz.ap, cdz.as, cdz.at, new cdz[0]);
   }

   protected void a(arm $$0, cmq $$1) {
      bvx<?> $$2 = $$1.ed();
      $$2.a(cdz.aw, this.b($$0, $$1));
      Optional<cmw> $$3 = Optional.empty();
      int $$4 = 0;
      List<cmq> $$5 = Lists.newArrayList();
      ceb $$6 = $$2.c(cdz.h).orElse(ceb.a());

      for (buv $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cmw || $$0x instanceof cmq))) {
         if ($$7 instanceof cmw $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cmq $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cdz.aq, $$3);
      $$2.a(cdz.ap, $$5);
      $$2.a(cdz.as, $$4);
      $$2.a(cdz.at, $$5.size());
   }

   private Optional<jg> b(arm $$0, cmq $$1) {
      return jg.a($$1.dx(), 8, 4, $$1x -> $$0.a_($$1x).a(awz.aT));
   }
}
