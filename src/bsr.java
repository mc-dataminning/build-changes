import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsr extends btd<bzw> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.h, brz.av, brz.ap, brz.ao, brz.ar, brz.as, new brz[0]);
   }

   protected void a(akk $$0, bzw $$1) {
      bjy<?> $$2 = $$1.dM();
      $$2.a(brz.av, this.b($$0, $$1));
      Optional<cac> $$3 = Optional.empty();
      int $$4 = 0;
      List<bzw> $$5 = Lists.newArrayList();
      bsb $$6 = $$2.c(brz.h).orElse(bsb.a());

      for (biy $$7 : $$6.b($$0x -> !$$0x.i_() && ($$0x instanceof cac || $$0x instanceof bzw))) {
         if ($$7 instanceof cac $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof bzw $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(brz.ap, $$3);
      $$2.a(brz.ao, $$5);
      $$2.a(brz.ar, $$4);
      $$2.a(brz.as, $$5.size());
   }

   private Optional<gu> b(akk $$0, bzw $$1) {
      return gu.a($$1.dk(), 8, 4, $$1x -> $$0.a_($$1x).a(apl.aR));
   }
}
