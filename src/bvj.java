import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bvj extends bvl<cdh> {
   private static final int a = 40;

   public bvj() {
      super(40);
   }

   protected void a(ame $$0, cdh $$1) {
      agh<csa> $$2 = $$0.ad();
      ht $$3 = $$1.dn();
      List<ia> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ht $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gq().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ia.a($$2, $$9));
               }
            }
         }
      }

      bmg<?> $$10 = $$1.dP();
      if (!$$4.isEmpty()) {
         $$10.a(buh.f, $$4);
      } else {
         $$10.b(buh.f);
      }
   }

   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.f);
   }
}
