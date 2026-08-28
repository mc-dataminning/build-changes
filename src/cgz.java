import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgz extends chm<cpl> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.h, cgg.ax, cgg.ar, cgg.aq, cgg.at, cgg.au, new cgg[0]);
   }

   protected void a(arq $$0, cpl $$1) {
      bye<?> $$2 = $$1.ec();
      $$2.a(cgg.ax, this.b($$0, $$1));
      Optional<cpr> $$3 = Optional.empty();
      int $$4 = 0;
      List<cpl> $$5 = Lists.newArrayList();
      cgi $$6 = $$2.c(cgg.h).orElse(cgi.a());

      for (bxe $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cpr || $$0x instanceof cpl))) {
         if ($$7 instanceof cpr $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cpl $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cgg.ar, $$3);
      $$2.a(cgg.aq, $$5);
      $$2.a(cgg.at, $$4);
      $$2.a(cgg.au, $$5.size());
   }

   private Optional<iu> b(arq $$0, cpl $$1) {
      return iu.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(axc.aU));
   }
}
