import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfu extends cgh<cnw> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.h, cfb.aw, cfb.aq, cfb.ap, cfb.as, cfb.at, new cfb[0]);
   }

   protected void a(arx $$0, cnw $$1) {
      bwz<?> $$2 = $$1.ec();
      $$2.a(cfb.aw, this.b($$0, $$1));
      Optional<coc> $$3 = Optional.empty();
      int $$4 = 0;
      List<cnw> $$5 = Lists.newArrayList();
      cfd $$6 = $$2.c(cfb.h).orElse(cfd.a());

      for (bvx $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof coc || $$0x instanceof cnw))) {
         if ($$7 instanceof coc $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cnw $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cfb.aq, $$3);
      $$2.a(cfb.ap, $$5);
      $$2.a(cfb.as, $$4);
      $$2.a(cfb.at, $$5.size());
   }

   private Optional<jh> b(arx $$0, cnw $$1) {
      return jh.a($$1.dw(), 8, 4, $$1x -> $$0.a_($$1x).a(axk.aU));
   }
}
