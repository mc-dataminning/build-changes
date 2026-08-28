import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cgn extends cgp<cpi> {
   private static final int a = 40;

   public cgn() {
      super(40);
   }

   protected void a(ash $$0, cpi $$1) {
      aly<dhh> $$2 = $$0.ah();
      jh $$3 = $$1.dv();
      List<jp> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jh $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gw().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jp.a($$2, $$9));
               }
            }
         }
      }

      bxh<?> $$10 = $$1.eb();
      if (!$$4.isEmpty()) {
         $$10.a(cfj.f, $$4);
      } else {
         $$10.b(cfj.f);
      }
   }

   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.f);
   }
}
