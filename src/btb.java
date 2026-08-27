import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class btb extends btd<caz> {
   private static final int a = 40;

   public btb() {
      super(40);
   }

   protected void a(akk $$0, caz $$1) {
      aeq<cpl> $$2 = $$0.ac();
      gu $$3 = $$1.dk();
      List<hd> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               gu $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gl().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(hd.a($$2, $$9));
               }
            }
         }
      }

      bjy<?> $$10 = $$1.dM();
      if (!$$4.isEmpty()) {
         $$10.a(brz.f, $$4);
      } else {
         $$10.b(brz.f);
      }
   }

   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.f);
   }
}
