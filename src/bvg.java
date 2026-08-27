import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvg extends bvl<blg> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.h, buh.L, buh.am);
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      bmg<?> $$2 = $$1.dP();
      List<ccj> $$3 = Lists.newArrayList();
      buj $$4 = $$2.c(buh.h).orElse(buj.a());
      Optional<bli> $$5 = $$4.a($$0x -> $$0x instanceof cbz || $$0x instanceof cab).map(bli.class::cast);

      for (blg $$7 : $$2.c(buh.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof ccj && ((ccj)$$7).gg()) {
            $$3.add((ccj)$$7);
         }
      }

      $$2.a(buh.L, $$5);
      $$2.a(buh.am, $$3);
   }
}
