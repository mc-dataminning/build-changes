import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdd extends cdi<bsy> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.h, ccc.M, ccc.an);
   }

   @Override
   protected void a(aqk $$0, bsy $$1) {
      bua<?> $$2 = $$1.dT();
      List<ckw> $$3 = Lists.newArrayList();
      cce $$4 = $$2.c(ccc.h).orElse(cce.a());
      Optional<bta> $$5 = $$4.a($$0x -> $$0x instanceof cke || $$0x instanceof cie).map(bta.class::cast);

      for (bsy $$7 : $$2.c(ccc.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof ckw && ((ckw)$$7).go()) {
            $$3.add((ckw)$$7);
         }
      }

      $$2.a(ccc.M, $$5);
      $$2.a(ccc.an, $$3);
   }
}
