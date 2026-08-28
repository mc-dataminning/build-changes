import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cgj extends cgl<cpe> {
   private static final int a = 40;

   public cgj() {
      super(40);
   }

   protected void a(ash $$0, cpe $$1) {
      aly<dha> $$2 = $$0.ah();
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

      bxd<?> $$10 = $$1.eb();
      if (!$$4.isEmpty()) {
         $$10.a(cff.f, $$4);
      } else {
         $$10.b(cff.f);
      }
   }

   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.f);
   }
}
