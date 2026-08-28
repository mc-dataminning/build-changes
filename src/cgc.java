import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgc extends cgp<coe> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.h, cfj.aw, cfj.aq, cfj.ap, cfj.as, cfj.at, new cfj[0]);
   }

   protected void a(ash $$0, coe $$1) {
      bxh<?> $$2 = $$1.ec();
      $$2.a(cfj.aw, this.b($$0, $$1));
      Optional<cok> $$3 = Optional.empty();
      int $$4 = 0;
      List<coe> $$5 = Lists.newArrayList();
      cfl $$6 = $$2.c(cfj.h).orElse(cfl.a());

      for (bwf $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof cok || $$0x instanceof coe))) {
         if ($$7 instanceof cok $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof coe $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cfj.aq, $$3);
      $$2.a(cfj.ap, $$5);
      $$2.a(cfj.as, $$4);
      $$2.a(cfj.at, $$5.size());
   }

   private Optional<jh> b(ash $$0, coe $$1) {
      return jh.a($$1.dw(), 8, 4, $$1x -> $$0.a_($$1x).a(axu.aU));
   }
}
