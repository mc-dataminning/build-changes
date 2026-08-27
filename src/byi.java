import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byi extends byn<bog> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.h, bxh.M, bxh.an);
   }

   @Override
   protected void a(aov $$0, bog $$1) {
      bpf<?> $$2 = $$1.dO();
      List<cfw> $$3 = Lists.newArrayList();
      bxj $$4 = $$2.c(bxh.h).orElse(bxj.a());
      Optional<boi> $$5 = $$4.a($$0x -> $$0x instanceof cfe || $$0x instanceof cdg).map(boi.class::cast);

      for (bog $$7 : $$2.c(bxh.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cfw && ((cfw)$$7).gh()) {
            $$3.add((cfw)$$7);
         }
      }

      $$2.a(bxh.M, $$5);
      $$2.a(bxh.an, $$3);
   }
}
