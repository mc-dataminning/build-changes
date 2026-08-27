import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buz extends bvl<cce> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.h, buh.av, buh.ap, buh.ao, buh.ar, buh.as, new buh[0]);
   }

   protected void a(ame $$0, cce $$1) {
      bmg<?> $$2 = $$1.dP();
      $$2.a(buh.av, this.b($$0, $$1));
      Optional<cck> $$3 = Optional.empty();
      int $$4 = 0;
      List<cce> $$5 = Lists.newArrayList();
      buj $$6 = $$2.c(buh.h).orElse(buj.a());

      for (blg $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cck || $$0x instanceof cce))) {
         if ($$7 instanceof cck $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cce $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(buh.ap, $$3);
      $$2.a(buh.ao, $$5);
      $$2.a(buh.ar, $$4);
      $$2.a(buh.as, $$5.size());
   }

   private Optional<ht> b(ame $$0, cce $$1) {
      return ht.a($$1.dn(), 8, 4, $$1x -> $$0.a_($$1x).a(arg.aR));
   }
}
