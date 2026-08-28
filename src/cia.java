import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cia extends cin<cqr> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.h, chh.ax, chh.ar, chh.aq, chh.at, chh.au, new chh[0]);
   }

   protected void a(asb $$0, cqr $$1) {
      bzf<?> $$2 = $$1.ec();
      $$2.a(chh.ax, this.b($$0, $$1));
      Optional<cqx> $$3 = Optional.empty();
      int $$4 = 0;
      List<cqr> $$5 = Lists.newArrayList();
      chj $$6 = $$2.c(chh.h).orElse(chj.a());

      for (byf $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cqx || $$0x instanceof cqr))) {
         if ($$7 instanceof cqx $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cqr $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(chh.ar, $$3);
      $$2.a(chh.aq, $$5);
      $$2.a(chh.at, $$4);
      $$2.a(chh.au, $$5.size());
   }

   private Optional<iw> b(asb $$0, cqr $$1) {
      return iw.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(axn.aU));
   }
}
