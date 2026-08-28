import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cej extends ceo<buf> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.h, cdi.M, cdi.an);
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      bvg<?> $$2 = $$1.dX();
      List<cme> $$3 = Lists.newArrayList();
      cdk $$4 = $$2.c(cdi.h).orElse(cdk.a());
      Optional<buh> $$5 = $$4.a($$0x -> $$0x instanceof clm || $$0x instanceof cjm).map(buh.class::cast);

      for (buf $$7 : $$2.c(cdi.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cme && ((cme)$$7).gp()) {
            $$3.add((cme)$$7);
         }
      }

      $$2.a(cdi.M, $$5);
      $$2.a(cdi.an, $$3);
   }
}
