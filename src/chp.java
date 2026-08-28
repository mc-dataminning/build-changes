import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chp extends cic<cqg> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.h, cgw.ax, cgw.ar, cgw.aq, cgw.at, cgw.au, new cgw[0]);
   }

   protected void a(ars $$0, cqg $$1) {
      byu<?> $$2 = $$1.ec();
      $$2.a(cgw.ax, this.b($$0, $$1));
      Optional<cqm> $$3 = Optional.empty();
      int $$4 = 0;
      List<cqg> $$5 = Lists.newArrayList();
      cgy $$6 = $$2.c(cgw.h).orElse(cgy.a());

      for (bxu $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cqm || $$0x instanceof cqg))) {
         if ($$7 instanceof cqm $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cqg $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cgw.ar, $$3);
      $$2.a(cgw.aq, $$5);
      $$2.a(cgw.at, $$4);
      $$2.a(cgw.au, $$5.size());
   }

   private Optional<iv> b(ars $$0, cqg $$1) {
      return iv.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(axe.aU));
   }
}
