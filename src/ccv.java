import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccv extends cdi<ckr> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.h, ccc.aw, ccc.aq, ccc.ap, ccc.as, ccc.at, new ccc[0]);
   }

   protected void a(aqk $$0, ckr $$1) {
      bua<?> $$2 = $$1.dT();
      $$2.a(ccc.aw, this.b($$0, $$1));
      Optional<ckx> $$3 = Optional.empty();
      int $$4 = 0;
      List<ckr> $$5 = Lists.newArrayList();
      cce $$6 = $$2.c(ccc.h).orElse(cce.a());

      for (bsy $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof ckx || $$0x instanceof ckr))) {
         if ($$7 instanceof ckx $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof ckr $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccc.aq, $$3);
      $$2.a(ccc.ap, $$5);
      $$2.a(ccc.as, $$4);
      $$2.a(ccc.at, $$5.size());
   }

   private Optional<ja> b(aqk $$0, ckr $$1) {
      return ja.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(avu.aS));
   }
}
