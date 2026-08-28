import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cex extends cfk<cmv> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.h, cee.aw, cee.aq, cee.ap, cee.as, cee.at, new cee[0]);
   }

   protected void a(arn $$0, cmv $$1) {
      bwc<?> $$2 = $$1.ed();
      $$2.a(cee.aw, this.b($$0, $$1));
      Optional<cnb> $$3 = Optional.empty();
      int $$4 = 0;
      List<cmv> $$5 = Lists.newArrayList();
      ceg $$6 = $$2.c(cee.h).orElse(ceg.a());

      for (bva $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cnb || $$0x instanceof cmv))) {
         if ($$7 instanceof cnb $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cmv $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cee.aq, $$3);
      $$2.a(cee.ap, $$5);
      $$2.a(cee.as, $$4);
      $$2.a(cee.at, $$5.size());
   }

   private Optional<jh> b(arn $$0, cmv $$1) {
      return jh.a($$1.dx(), 8, 4, $$1x -> $$0.a_($$1x).a(axa.aT));
   }
}
