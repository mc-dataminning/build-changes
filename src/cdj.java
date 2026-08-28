import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cdj extends cdl<clx> {
   private static final int a = 40;

   public cdj() {
      super(40);
   }

   protected void a(aqm $$0, clx $$1) {
      akj<dcf> $$2 = $$0.af();
      ja $$3 = $$1.dq();
      List<ji> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ja $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gz().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ji.a($$2, $$9));
               }
            }
         }
      }

      bud<?> $$10 = $$1.dU();
      if (!$$4.isEmpty()) {
         $$10.a(ccf.f, $$4);
      } else {
         $$10.b(ccf.f);
      }
   }

   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.f);
   }
}
