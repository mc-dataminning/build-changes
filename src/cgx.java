import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cgx extends cgz<cpu> {
   private static final int a = 40;

   public cgx() {
      super(40);
   }

   protected void a(arn $$0, cpu $$1) {
      alc<dhp> $$2 = $$0.aj();
      jj $$3 = $$1.dv();
      List<jr> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jj $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gy().b().a().e().contains($$0.a_($$9).b())) {
                  $$4.add(jr.a($$2, $$9));
               }
            }
         }
      }

      bxr<?> $$10 = $$1.eb();
      if (!$$4.isEmpty()) {
         $$10.a(cft.f, $$4);
      } else {
         $$10.b(cft.f);
      }
   }

   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.f);
   }
}
