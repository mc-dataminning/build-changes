import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cii extends cin<byf> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.h, chh.N, chh.ao);
   }

   @Override
   protected void a(asb $$0, byf $$1) {
      bzf<?> $$2 = $$1.ec();
      List<cqw> $$3 = Lists.newArrayList();
      chj $$4 = $$2.c(chh.h).orElse(chj.a());
      Optional<byh> $$5 = $$4.a($$0x -> $$0x instanceof cqb || $$0x instanceof coa).map(byh.class::cast);

      for (byf $$7 : $$2.c(chh.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cqw && ((cqw)$$7).t()) {
            $$3.add((cqw)$$7);
         }
      }

      $$2.a(chh.N, $$5);
      $$2.a(chh.ao, $$3);
   }
}
