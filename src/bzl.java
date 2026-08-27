import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzl extends bzy<che> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.h, bys.aw, bys.aq, bys.ap, bys.as, bys.at, new bys[0]);
   }

   protected void a(apf $$0, che $$1) {
      bqq<?> $$2 = $$1.dP();
      $$2.a(bys.aw, this.b($$0, $$1));
      Optional<chk> $$3 = Optional.empty();
      int $$4 = 0;
      List<che> $$5 = Lists.newArrayList();
      byu $$6 = $$2.c(bys.h).orElse(byu.a());

      for (bpp $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof chk || $$0x instanceof che))) {
         if ($$7 instanceof chk $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof che $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bys.aq, $$3);
      $$2.a(bys.ap, $$5);
      $$2.a(bys.as, $$4);
      $$2.a(bys.at, $$5.size());
   }

   private Optional<ib> b(apf $$0, che $$1) {
      return ib.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(aun.aS));
   }
}
