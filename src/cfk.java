import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfk extends cfp<bvf> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.h, cej.M, cej.an);
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      bwh<?> $$2 = $$1.ec();
      List<cni> $$3 = Lists.newArrayList();
      cel $$4 = $$2.c(cej.h).orElse(cel.a());
      Optional<bvh> $$5 = $$4.a($$0x -> $$0x instanceof cmn || $$0x instanceof ckn).map(bvh.class::cast);

      for (bvf $$7 : $$2.c(cej.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cni && ((cni)$$7).gp()) {
            $$3.add((cni)$$7);
         }
      }

      $$2.a(cej.M, $$5);
      $$2.a(cej.an, $$3);
   }
}
