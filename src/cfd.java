import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cfd extends cff<cnt> {
   private static final int a = 40;

   public cfd() {
      super(40);
   }

   protected void a(arm $$0, cnt $$1) {
      alg<dev> $$2 = $$0.ag();
      jg $$3 = $$1.dx();
      List<jo> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jg $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gF().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jo.a($$2, $$9));
               }
            }
         }
      }

      bvx<?> $$10 = $$1.ed();
      if (!$$4.isEmpty()) {
         $$10.a(cdz.f, $$4);
      } else {
         $$10.b(cdz.f);
      }
   }

   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.f);
   }
}
