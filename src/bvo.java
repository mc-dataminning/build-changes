import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bvo extends bvq<cdm> {
   private static final int a = 40;

   public bvo() {
      super(40);
   }

   protected void a(ami $$0, cdm $$1) {
      agl<csf> $$2 = $$0.ad();
      hx $$3 = $$1.dn();
      List<ie> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               hx $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gq().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ie.a($$2, $$9));
               }
            }
         }
      }

      bml<?> $$10 = $$1.dP();
      if (!$$4.isEmpty()) {
         $$10.a(bum.f, $$4);
      } else {
         $$10.b(bum.f);
      }
   }

   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.f);
   }
}
