import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bym extends byr<boi> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.h, bxl.M, bxl.an);
   }

   @Override
   protected void a(aow $$0, boi $$1) {
      bpj<?> $$2 = $$1.dO();
      List<cga> $$3 = Lists.newArrayList();
      bxn $$4 = $$2.c(bxl.h).orElse(bxn.a());
      Optional<bok> $$5 = $$4.a($$0x -> $$0x instanceof cfi || $$0x instanceof cdk).map(bok.class::cast);

      for (boi $$7 : $$2.c(bxl.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cga && ((cga)$$7).gh()) {
            $$3.add((cga)$$7);
         }
      }

      $$2.a(bxl.M, $$5);
      $$2.a(bxl.an, $$3);
   }
}
