import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfm extends cfr<bvh> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.h, cel.M, cel.an);
   }

   @Override
   protected void a(ard $$0, bvh $$1) {
      bwj<?> $$2 = $$1.eb();
      List<cnk> $$3 = Lists.newArrayList();
      cen $$4 = $$2.c(cel.h).orElse(cen.a());
      Optional<bvj> $$5 = $$4.a($$0x -> $$0x instanceof cmp || $$0x instanceof ckp).map(bvj.class::cast);

      for (bvh $$7 : $$2.c(cel.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cnk && ((cnk)$$7).gs()) {
            $$3.add((cnk)$$7);
         }
      }

      $$2.a(cel.M, $$5);
      $$2.a(cel.an, $$3);
   }
}
