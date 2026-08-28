import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cgo extends cgq<cpj> {
   private static final int a = 40;

   public cgo() {
      super(40);
   }

   protected void a(ash $$0, cpj $$1) {
      aly<dhi> $$2 = $$0.ah();
      jh $$3 = $$1.dw();
      List<jp> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jh $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gy().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jp.a($$2, $$9));
               }
            }
         }
      }

      bxi<?> $$10 = $$1.ec();
      if (!$$4.isEmpty()) {
         $$10.a(cfk.f, $$4);
      } else {
         $$10.b(cfk.f);
      }
   }

   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.f);
   }
}
