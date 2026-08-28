import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgc extends cgh<bvx> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.h, cfb.M, cfb.an);
   }

   @Override
   protected void a(arx $$0, bvx $$1) {
      bwz<?> $$2 = $$1.ec();
      List<cob> $$3 = Lists.newArrayList();
      cfd $$4 = $$2.c(cfb.h).orElse(cfd.a());
      Optional<bvz> $$5 = $$4.a($$0x -> $$0x instanceof cnf || $$0x instanceof clf).map(bvz.class::cast);

      for (bvx $$7 : $$2.c(cfb.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cob && ((cob)$$7).go()) {
            $$3.add((cob)$$7);
         }
      }

      $$2.a(cfb.M, $$5);
      $$2.a(cfb.an, $$3);
   }
}
