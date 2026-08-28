import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chx extends cic<bxu> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.h, cgw.N, cgw.ao);
   }

   @Override
   protected void a(ars $$0, bxu $$1) {
      byu<?> $$2 = $$1.ec();
      List<cql> $$3 = Lists.newArrayList();
      cgy $$4 = $$2.c(cgw.h).orElse(cgy.a());
      Optional<bxw> $$5 = $$4.a($$0x -> $$0x instanceof cpq || $$0x instanceof cnp).map(bxw.class::cast);

      for (bxu $$7 : $$2.c(cgw.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cql && ((cql)$$7).t()) {
            $$3.add((cql)$$7);
         }
      }

      $$2.a(cgw.N, $$5);
      $$2.a(cgw.ao, $$3);
   }
}
