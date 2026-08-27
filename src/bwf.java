import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwf extends bwr<cdr> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.h, bvm.av, bvm.ap, bvm.ao, bvm.ar, bvm.as, new bvm[0]);
   }

   protected void a(and $$0, cdr $$1) {
      bnk<?> $$2 = $$1.dO();
      $$2.a(bvm.av, this.b($$0, $$1));
      Optional<cdx> $$3 = Optional.empty();
      int $$4 = 0;
      List<cdr> $$5 = Lists.newArrayList();
      bvo $$6 = $$2.c(bvm.h).orElse(bvo.a());

      for (bmk $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cdx || $$0x instanceof cdr))) {
         if ($$7 instanceof cdx $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cdr $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bvm.ap, $$3);
      $$2.a(bvm.ao, $$5);
      $$2.a(bvm.ar, $$4);
      $$2.a(bvm.as, $$5.size());
   }

   private Optional<hx> b(and $$0, cdr $$1) {
      return hx.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(asg.aR));
   }
}
