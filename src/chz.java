import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chz extends cie<bxw> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.h, cgy.N, cgy.ao);
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      byw<?> $$2 = $$1.ec();
      List<cqn> $$3 = Lists.newArrayList();
      cha $$4 = $$2.c(cgy.h).orElse(cha.a());
      Optional<bxy> $$5 = $$4.a($$0x -> $$0x instanceof cps || $$0x instanceof cnr).map(bxy.class::cast);

      for (bxw $$7 : $$2.c(cgy.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cqn && ((cqn)$$7).t()) {
            $$3.add((cqn)$$7);
         }
      }

      $$2.a(cgy.N, $$5);
      $$2.a(cgy.ao, $$3);
   }
}
