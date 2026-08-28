import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgx extends chk<cph> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.h, cge.ax, cge.ar, cge.aq, cge.at, cge.au, new cge[0]);
   }

   protected void a(arq $$0, cph $$1) {
      byc<?> $$2 = $$1.eb();
      $$2.a(cge.ax, this.b($$0, $$1));
      Optional<cpn> $$3 = Optional.empty();
      int $$4 = 0;
      List<cph> $$5 = Lists.newArrayList();
      cgg $$6 = $$2.c(cge.h).orElse(cgg.a());

      for (bxc $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cpn || $$0x instanceof cph))) {
         if ($$7 instanceof cpn $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cph $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cge.ar, $$3);
      $$2.a(cge.aq, $$5);
      $$2.a(cge.at, $$4);
      $$2.a(cge.au, $$5.size());
   }

   private Optional<iu> b(arq $$0, cph $$1) {
      return iu.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(axc.aU));
   }
}
