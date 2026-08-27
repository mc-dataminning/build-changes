import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bye extends byr<cfv> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.h, bxl.aw, bxl.aq, bxl.ap, bxl.as, bxl.at, new bxl[0]);
   }

   protected void a(aow $$0, cfv $$1) {
      bpj<?> $$2 = $$1.dO();
      $$2.a(bxl.aw, this.b($$0, $$1));
      Optional<cgb> $$3 = Optional.empty();
      int $$4 = 0;
      List<cfv> $$5 = Lists.newArrayList();
      bxn $$6 = $$2.c(bxl.h).orElse(bxn.a());

      for (boi $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cgb || $$0x instanceof cfv))) {
         if ($$7 instanceof cgb $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cfv $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bxl.aq, $$3);
      $$2.a(bxl.ap, $$5);
      $$2.a(bxl.as, $$4);
      $$2.a(bxl.at, $$5.size());
   }

   private Optional<hz> b(aow $$0, cfv $$1) {
      return hz.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(aua.aR));
   }
}
