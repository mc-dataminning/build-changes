import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bti extends btn<bji> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.h, bsj.L, bsj.am);
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      bki<?> $$2 = $$1.dN();
      List<cal> $$3 = Lists.newArrayList();
      bsl $$4 = $$2.c(bsj.h).orElse(bsl.a());
      Optional<bjk> $$5 = $$4.a($$0x -> $$0x instanceof cab || $$0x instanceof byd).map(bjk.class::cast);

      for (bji $$7 : $$2.c(bsj.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cal && ((cal)$$7).ge()) {
            $$3.add((cal)$$7);
         }
      }

      $$2.a(bsj.L, $$5);
      $$2.a(bsj.am, $$3);
   }
}
