import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cck extends ccx<cki> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.h, cbr.aw, cbr.aq, cbr.ap, cbr.as, cbr.at, new cbr[0]);
   }

   protected void a(aqt $$0, cki $$1) {
      btp<?> $$2 = $$1.dZ();
      $$2.a(cbr.aw, this.b($$0, $$1));
      Optional<cko> $$3 = Optional.empty();
      int $$4 = 0;
      List<cki> $$5 = Lists.newArrayList();
      cbt $$6 = $$2.c(cbr.h).orElse(cbt.a());

      for (bso $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cko || $$0x instanceof cki))) {
         if ($$7 instanceof cko $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cki $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cbr.aq, $$3);
      $$2.a(cbr.ap, $$5);
      $$2.a(cbr.as, $$4);
      $$2.a(cbr.at, $$5.size());
   }

   private Optional<ir> b(aqt $$0, cki $$1) {
      return ir.a($$1.du(), 8, 4, $$1x -> $$0.a_($$1x).a(awe.aU));
   }
}
