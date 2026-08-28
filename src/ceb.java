import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ceb extends ceo<clz> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.h, cdi.aw, cdi.aq, cdi.ap, cdi.as, cdi.at, new cdi[0]);
   }

   protected void a(arg $$0, clz $$1) {
      bvg<?> $$2 = $$1.dX();
      $$2.a(cdi.aw, this.b($$0, $$1));
      Optional<cmf> $$3 = Optional.empty();
      int $$4 = 0;
      List<clz> $$5 = Lists.newArrayList();
      cdk $$6 = $$2.c(cdi.h).orElse(cdk.a());

      for (buf $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cmf || $$0x instanceof clz))) {
         if ($$7 instanceof cmf $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clz $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cdi.aq, $$3);
      $$2.a(cdi.ap, $$5);
      $$2.a(cdi.as, $$4);
      $$2.a(cdi.at, $$5.size());
   }

   private Optional<je> b(arg $$0, clz $$1) {
      return je.a($$1.ds(), 8, 4, $$1x -> $$0.a_($$1x).a(aws.aT));
   }
}
