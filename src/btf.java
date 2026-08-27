import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btf extends btr<cak> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.h, bsn.av, bsn.ap, bsn.ao, bsn.ar, bsn.as, new bsn[0]);
   }

   protected void a(akt $$0, cak $$1) {
      bkm<?> $$2 = $$1.dN();
      $$2.a(bsn.av, this.b($$0, $$1));
      Optional<caq> $$3 = Optional.empty();
      int $$4 = 0;
      List<cak> $$5 = Lists.newArrayList();
      bsp $$6 = $$2.c(bsn.h).orElse(bsp.a());

      for (bjm $$7 : $$6.b($$0x -> !$$0x.m_() && ($$0x instanceof caq || $$0x instanceof cak))) {
         if ($$7 instanceof caq $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cak $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bsn.ap, $$3);
      $$2.a(bsn.ao, $$5);
      $$2.a(bsn.ar, $$4);
      $$2.a(bsn.as, $$5.size());
   }

   private Optional<gw> b(akt $$0, cak $$1) {
      return gw.a($$1.dl(), 8, 4, $$1x -> $$0.a_($$1x).a(apv.aR));
   }
}
