import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cer extends cet<cnh> {
   private static final int a = 40;

   public cer() {
      super(40);
   }

   protected void a(arh $$0, cnh $$1) {
      alb<deg> $$2 = $$0.ag();
      je $$3 = $$1.ds();
      List<jm> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               je $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gz().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jm.a($$2, $$9));
               }
            }
         }
      }

      bvl<?> $$10 = $$1.dX();
      if (!$$4.isEmpty()) {
         $$10.a(cdn.f, $$4);
      } else {
         $$10.b(cdn.f);
      }
   }

   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.f);
   }
}
