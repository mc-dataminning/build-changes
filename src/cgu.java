import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgu extends chh<cpb> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.h, cgb.ax, cgb.ar, cgb.aq, cgb.at, cgb.au, new cgb[0]);
   }

   protected void a(aro $$0, cpb $$1) {
      bxz<?> $$2 = $$1.eb();
      $$2.a(cgb.ax, this.b($$0, $$1));
      Optional<cph> $$3 = Optional.empty();
      int $$4 = 0;
      List<cpb> $$5 = Lists.newArrayList();
      cgd $$6 = $$2.c(cgb.h).orElse(cgd.a());

      for (bwz $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cph || $$0x instanceof cpb))) {
         if ($$7 instanceof cph $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cpb $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cgb.ar, $$3);
      $$2.a(cgb.aq, $$5);
      $$2.a(cgb.at, $$4);
      $$2.a(cgb.au, $$5.size());
   }

   private Optional<iu> b(aro $$0, cpb $$1) {
      return iu.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(axa.aU));
   }
}
