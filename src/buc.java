import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buc extends buo<cbh> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.h, btk.av, btk.ap, btk.ao, btk.ar, btk.as, new btk[0]);
   }

   protected void a(alq $$0, cbh $$1) {
      blj<?> $$2 = $$1.dN();
      $$2.a(btk.av, this.b($$0, $$1));
      Optional<cbn> $$3 = Optional.empty();
      int $$4 = 0;
      List<cbh> $$5 = Lists.newArrayList();
      btm $$6 = $$2.c(btk.h).orElse(btm.a());

      for (bkj $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cbn || $$0x instanceof cbh))) {
         if ($$7 instanceof cbn $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cbh $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(btk.ap, $$3);
      $$2.a(btk.ao, $$5);
      $$2.a(btk.ar, $$4);
      $$2.a(btk.as, $$5.size());
   }

   private Optional<ht> b(alq $$0, cbh $$1) {
      return ht.a($$1.dl(), 8, 4, $$1x -> $$0.a_($$1x).a(aqs.aR));
   }
}
