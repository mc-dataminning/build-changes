import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cax extends cbc<bqt> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.h, bzw.M, bzw.an);
   }

   @Override
   protected void a(apu $$0, bqt $$1) {
      bru<?> $$2 = $$1.dP();
      List<cip> $$3 = Lists.newArrayList();
      bzy $$4 = $$2.c(bzw.h).orElse(bzy.a());
      Optional<bqv> $$5 = $$4.a($$0x -> $$0x instanceof chx || $$0x instanceof cfy).map(bqv.class::cast);

      for (bqt $$7 : $$2.c(bzw.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cip && ((cip)$$7).go()) {
            $$3.add((cip)$$7);
         }
      }

      $$2.a(bzw.M, $$5);
      $$2.a(bzw.an, $$3);
   }
}
