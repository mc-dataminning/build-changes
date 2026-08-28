import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgm extends cgz<cor> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.h, cft.ax, cft.ar, cft.aq, cft.at, cft.au, new cft[0]);
   }

   protected void a(arn $$0, cor $$1) {
      bxr<?> $$2 = $$1.eb();
      $$2.a(cft.ax, this.b($$0, $$1));
      Optional<cox> $$3 = Optional.empty();
      int $$4 = 0;
      List<cor> $$5 = Lists.newArrayList();
      cfv $$6 = $$2.c(cft.h).orElse(cfv.a());

      for (bwr $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cox || $$0x instanceof cor))) {
         if ($$7 instanceof cox $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cor $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cft.ar, $$3);
      $$2.a(cft.aq, $$5);
      $$2.a(cft.at, $$4);
      $$2.a(cft.au, $$5.size());
   }

   private Optional<jj> b(arn $$0, cor $$1) {
      return jj.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(awz.aU));
   }
}
