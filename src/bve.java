import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bve extends bvq<ccj> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.h, bum.av, bum.ap, bum.ao, bum.ar, bum.as, new bum[0]);
   }

   protected void a(ami $$0, ccj $$1) {
      bml<?> $$2 = $$1.dP();
      $$2.a(bum.av, this.b($$0, $$1));
      Optional<ccp> $$3 = Optional.empty();
      int $$4 = 0;
      List<ccj> $$5 = Lists.newArrayList();
      buo $$6 = $$2.c(bum.h).orElse(buo.a());

      for (bll $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof ccp || $$0x instanceof ccj))) {
         if ($$7 instanceof ccp $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof ccj $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bum.ap, $$3);
      $$2.a(bum.ao, $$5);
      $$2.a(bum.ar, $$4);
      $$2.a(bum.as, $$5.size());
   }

   private Optional<hx> b(ami $$0, ccj $$1) {
      return hx.a($$1.dn(), 8, 4, $$1x -> $$0.a_($$1x).a(ark.aR));
   }
}
