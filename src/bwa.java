import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bwa extends bwc<cee> {
   private static final int a = 40;

   public bwa() {
      super(40);
   }

   protected void a(amp $$0, cee $$1) {
      ags<csy> $$2 = $$0.ad();
      hv $$3 = $$1.dm();
      List<id> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               hv $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gp().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(id.a($$2, $$9));
               }
            }
         }
      }

      bmv<?> $$10 = $$1.dO();
      if (!$$4.isEmpty()) {
         $$10.a(bux.f, $$4);
      } else {
         $$10.b(bux.f);
      }
   }

   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.f);
   }
}
