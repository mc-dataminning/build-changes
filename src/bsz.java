import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsz extends btl<cae> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.h, bsh.av, bsh.ap, bsh.ao, bsh.ar, bsh.as, new bsh[0]);
   }

   protected void a(akq $$0, cae $$1) {
      bkg<?> $$2 = $$1.dN();
      $$2.a(bsh.av, this.b($$0, $$1));
      Optional<cak> $$3 = Optional.empty();
      int $$4 = 0;
      List<cae> $$5 = Lists.newArrayList();
      bsj $$6 = $$2.c(bsh.h).orElse(bsj.a());

      for (bjg $$7 : $$6.b($$0x -> !$$0x.m_() && ($$0x instanceof cak || $$0x instanceof cae))) {
         if ($$7 instanceof cak $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cae $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bsh.ap, $$3);
      $$2.a(bsh.ao, $$5);
      $$2.a(bsh.ar, $$4);
      $$2.a(bsh.as, $$5.size());
   }

   private Optional<gw> b(akq $$0, cae $$1) {
      return gw.a($$1.dl(), 8, 4, $$1x -> $$0.a_($$1x).a(aps.aR));
   }
}
