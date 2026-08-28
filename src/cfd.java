import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfd extends cfq<cnf> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.h, cek.aw, cek.aq, cek.ap, cek.as, cek.at, new cek[0]);
   }

   protected void a(arc $$0, cnf $$1) {
      bwi<?> $$2 = $$1.ec();
      $$2.a(cek.aw, this.b($$0, $$1));
      Optional<cnl> $$3 = Optional.empty();
      int $$4 = 0;
      List<cnf> $$5 = Lists.newArrayList();
      cem $$6 = $$2.c(cek.h).orElse(cem.a());

      for (bvg $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof cnl || $$0x instanceof cnf))) {
         if ($$7 instanceof cnl $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cnf $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cek.aq, $$3);
      $$2.a(cek.ap, $$5);
      $$2.a(cek.as, $$4);
      $$2.a(cek.at, $$5.size());
   }

   private Optional<ji> b(arc $$0, cnf $$1) {
      return ji.a($$1.dw(), 8, 4, $$1x -> $$0.a_($$1x).a(awp.aU));
   }
}
