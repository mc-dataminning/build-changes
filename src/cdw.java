import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cdw extends cdy<cmk> {
   private static final int a = 40;

   public cdw() {
      super(40);
   }

   protected void a(aqu $$0, cmk $$1) {
      akq<dcw> $$2 = $$0.af();
      jd $$3 = $$1.dp();
      List<jl> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jd $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gw().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jl.a($$2, $$9));
               }
            }
         }
      }

      buq<?> $$10 = $$1.dU();
      if (!$$4.isEmpty()) {
         $$10.a(ccs.f, $$4);
      } else {
         $$10.b(ccs.f);
      }
   }

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.f);
   }
}
