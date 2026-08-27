import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccl extends ccy<ckg> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.h, cbs.aw, cbs.aq, cbs.ap, cbs.as, cbs.at, new cbs[0]);
   }

   protected void a(aqm $$0, ckg $$1) {
      btq<?> $$2 = $$1.dS();
      $$2.a(cbs.aw, this.b($$0, $$1));
      Optional<ckm> $$3 = Optional.empty();
      int $$4 = 0;
      List<ckg> $$5 = Lists.newArrayList();
      cbu $$6 = $$2.c(cbs.h).orElse(cbu.a());

      for (bso $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof ckm || $$0x instanceof ckg))) {
         if ($$7 instanceof ckm $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof ckg $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cbs.aq, $$3);
      $$2.a(cbs.ap, $$5);
      $$2.a(cbs.as, $$4);
      $$2.a(cbs.at, $$5.size());
   }

   private Optional<io> b(aqm $$0, ckg $$1) {
      return io.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(avw.aS));
   }
}
