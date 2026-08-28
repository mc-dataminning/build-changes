import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cdg extends cdi<clu> {
   private static final int a = 40;

   public cdg() {
      super(40);
   }

   protected void a(aqk $$0, clu $$1) {
      akj<dcd> $$2 = $$0.af();
      ja $$3 = $$1.dp();
      List<ji> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ja $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gy().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ji.a($$2, $$9));
               }
            }
         }
      }

      bua<?> $$10 = $$1.dT();
      if (!$$4.isEmpty()) {
         $$10.a(ccc.f, $$4);
      } else {
         $$10.b(ccc.f);
      }
   }

   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.f);
   }
}
