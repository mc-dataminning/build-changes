import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwa extends bwm<cdl> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.h, bvh.av, bvh.ap, bvh.ao, bvh.ar, bvh.as, new bvh[0]);
   }

   protected void a(amz $$0, cdl $$1) {
      bnf<?> $$2 = $$1.dO();
      $$2.a(bvh.av, this.b($$0, $$1));
      Optional<cdr> $$3 = Optional.empty();
      int $$4 = 0;
      List<cdl> $$5 = Lists.newArrayList();
      bvj $$6 = $$2.c(bvh.h).orElse(bvj.a());

      for (bmf $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cdr || $$0x instanceof cdl))) {
         if ($$7 instanceof cdr $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cdl $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bvh.ap, $$3);
      $$2.a(bvh.ao, $$5);
      $$2.a(bvh.ar, $$4);
      $$2.a(bvh.as, $$5.size());
   }

   private Optional<hx> b(amz $$0, cdl $$1) {
      return hx.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(asb.aR));
   }
}
