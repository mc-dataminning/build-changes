import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class btc extends bte<cba> {
   private static final int a = 40;

   public btc() {
      super(40);
   }

   protected void a(akk $$0, cba $$1) {
      aeq<cpm> $$2 = $$0.ac();
      gu $$3 = $$1.dk();
      List<hd> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               gu $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gk().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(hd.a($$2, $$9));
               }
            }
         }
      }

      bjz<?> $$10 = $$1.dM();
      if (!$$4.isEmpty()) {
         $$10.a(bsa.f, $$4);
      } else {
         $$10.b(bsa.f);
      }
   }

   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.f);
   }
}
