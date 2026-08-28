import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfn extends cfs<bvi> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.h, cem.M, cem.an);
   }

   @Override
   protected void a(ard $$0, bvi $$1) {
      bwk<?> $$2 = $$1.eb();
      List<cnl> $$3 = Lists.newArrayList();
      ceo $$4 = $$2.c(cem.h).orElse(ceo.a());
      Optional<bvk> $$5 = $$4.a($$0x -> $$0x instanceof cmq || $$0x instanceof ckq).map(bvk.class::cast);

      for (bvi $$7 : $$2.c(cem.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cnl && ((cnl)$$7).gs()) {
            $$3.add((cnl)$$7);
         }
      }

      $$2.a(cem.M, $$5);
      $$2.a(cem.an, $$3);
   }
}
