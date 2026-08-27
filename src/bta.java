import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bta extends btc<cay> {
   private static final int a = 40;

   public bta() {
      super(40);
   }

   protected void a(aki $$0, cay $$1) {
      aeo<cpk> $$2 = $$0.ac();
      gv $$3 = $$1.dk();
      List<he> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               gv $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gk().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(he.a($$2, $$9));
               }
            }
         }
      }

      bjx<?> $$10 = $$1.dM();
      if (!$$4.isEmpty()) {
         $$10.a(bry.f, $$4);
      } else {
         $$10.b(bry.f);
      }
   }

   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.f);
   }
}
