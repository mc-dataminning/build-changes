import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsu extends btg<bzz> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.h, bsc.av, bsc.ap, bsc.ao, bsc.ar, bsc.as, new bsc[0]);
   }

   protected void a(akn $$0, bzz $$1) {
      bkb<?> $$2 = $$1.dM();
      $$2.a(bsc.av, this.b($$0, $$1));
      Optional<caf> $$3 = Optional.empty();
      int $$4 = 0;
      List<bzz> $$5 = Lists.newArrayList();
      bse $$6 = $$2.c(bsc.h).orElse(bse.a());

      for (bjb $$7 : $$6.b($$0x -> !$$0x.i_() && ($$0x instanceof caf || $$0x instanceof bzz))) {
         if ($$7 instanceof caf $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof bzz $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bsc.ap, $$3);
      $$2.a(bsc.ao, $$5);
      $$2.a(bsc.ar, $$4);
      $$2.a(bsc.as, $$5.size());
   }

   private Optional<gw> b(akn $$0, bzz $$1) {
      return gw.a($$1.dk(), 8, 4, $$1x -> $$0.a_($$1x).a(apo.aR));
   }
}
