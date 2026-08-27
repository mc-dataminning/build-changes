import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bwp extends bwr<ceu> {
   private static final int a = 40;

   public bwp() {
      super(40);
   }

   protected void a(and $$0, ceu $$1) {
      ahf<cto> $$2 = $$0.ae();
      hx $$3 = $$1.dm();
      List<ig> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               hx $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gp().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ig.a($$2, $$9));
               }
            }
         }
      }

      bnk<?> $$10 = $$1.dO();
      if (!$$4.isEmpty()) {
         $$10.a(bvm.f, $$4);
      } else {
         $$10.b(bvm.f);
      }
   }

   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.f);
   }
}
