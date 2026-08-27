import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bur extends bvd<cbw> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.h, btz.av, btz.ap, btz.ao, btz.ar, btz.as, new btz[0]);
   }

   protected void a(ama $$0, cbw $$1) {
      bly<?> $$2 = $$1.dN();
      $$2.a(btz.av, this.b($$0, $$1));
      Optional<ccc> $$3 = Optional.empty();
      int $$4 = 0;
      List<cbw> $$5 = Lists.newArrayList();
      bub $$6 = $$2.c(btz.h).orElse(bub.a());

      for (bky $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof ccc || $$0x instanceof cbw))) {
         if ($$7 instanceof ccc $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cbw $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(btz.ap, $$3);
      $$2.a(btz.ao, $$5);
      $$2.a(btz.ar, $$4);
      $$2.a(btz.as, $$5.size());
   }

   private Optional<ht> b(ama $$0, cbw $$1) {
      return ht.a($$1.dl(), 8, 4, $$1x -> $$0.a_($$1x).a(arc.aR));
   }
}
