import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cds extends cdu<cmf> {
   private static final int a = 40;

   public cds() {
      super(40);
   }

   protected void a(arb $$0, cmf $$1) {
      ala<dbt> $$2 = $$0.af();
      iz $$3 = $$1.dp();
      List<jh> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               iz $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gB().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jh.a($$2, $$9));
               }
            }
         }
      }

      bum<?> $$10 = $$1.dS();
      if (!$$4.isEmpty()) {
         $$10.a(cco.f, $$4);
      } else {
         $$10.b(cco.f);
      }
   }

   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.f);
   }
}
