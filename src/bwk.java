import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bwk extends bwm<ceo> {
   private static final int a = 40;

   public bwk() {
      super(40);
   }

   protected void a(amz $$0, ceo $$1) {
      ahc<cti> $$2 = $$0.ae();
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

      bnf<?> $$10 = $$1.dO();
      if (!$$4.isEmpty()) {
         $$10.a(bvh.f, $$4);
      } else {
         $$10.b(bvh.f);
      }
   }

   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.f);
   }
}
