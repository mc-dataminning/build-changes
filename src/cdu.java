import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cdu extends cdw<cmi> {
   private static final int a = 40;

   public cdu() {
      super(40);
   }

   protected void a(aqt $$0, cmi $$1) {
      akp<dcu> $$2 = $$0.af();
      jd $$3 = $$1.dq();
      List<jl> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jd $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gx().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jl.a($$2, $$9));
               }
            }
         }
      }

      buo<?> $$10 = $$1.dU();
      if (!$$4.isEmpty()) {
         $$10.a(ccq.f, $$4);
      } else {
         $$10.b(ccq.f);
      }
   }

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.f);
   }
}
