import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsq extends btc<bzv> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.h, bry.av, bry.ap, bry.ao, bry.ar, bry.as, new bry[0]);
   }

   protected void a(aki $$0, bzv $$1) {
      bjx<?> $$2 = $$1.dM();
      $$2.a(bry.av, this.b($$0, $$1));
      Optional<cab> $$3 = Optional.empty();
      int $$4 = 0;
      List<bzv> $$5 = Lists.newArrayList();
      bsa $$6 = $$2.c(bry.h).orElse(bsa.a());

      for (biw $$7 : $$6.b($$0x -> !$$0x.i_() && ($$0x instanceof cab || $$0x instanceof bzv))) {
         if ($$7 instanceof cab $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof bzv $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bry.ap, $$3);
      $$2.a(bry.ao, $$5);
      $$2.a(bry.ar, $$4);
      $$2.a(bry.as, $$5.size());
   }

   private Optional<gv> b(aki $$0, bzv $$1) {
      return gv.a($$1.dk(), 8, 4, $$1x -> $$0.a_($$1x).a(apj.aR));
   }
}
