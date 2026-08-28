import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class che extends chr<cpv> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.h, cgl.ax, cgl.ar, cgl.aq, cgl.at, cgl.au, new cgl[0]);
   }

   protected void a(arq $$0, cpv $$1) {
      byj<?> $$2 = $$1.eb();
      $$2.a(cgl.ax, this.b($$0, $$1));
      Optional<cqb> $$3 = Optional.empty();
      int $$4 = 0;
      List<cpv> $$5 = Lists.newArrayList();
      cgn $$6 = $$2.c(cgl.h).orElse(cgn.a());

      for (bxj $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cqb || $$0x instanceof cpv))) {
         if ($$7 instanceof cqb $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cpv $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cgl.ar, $$3);
      $$2.a(cgl.aq, $$5);
      $$2.a(cgl.at, $$4);
      $$2.a(cgl.au, $$5.size());
   }

   private Optional<iv> b(arq $$0, cpv $$1) {
      return iv.a($$1.du(), 8, 4, $$1x -> $$0.a_($$1x).a(axc.aU));
   }
}
