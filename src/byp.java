import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class byp extends byr<cgy> {
   private static final int a = 40;

   public byp() {
      super(40);
   }

   protected void a(aow $$0, cgy $$1) {
      aix<cvr> $$2 = $$0.ad();
      hz $$3 = $$1.dm();
      List<ii> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               hz $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gr().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ii.a($$2, $$9));
               }
            }
         }
      }

      bpj<?> $$10 = $$1.dO();
      if (!$$4.isEmpty()) {
         $$10.a(bxl.f, $$4);
      } else {
         $$10.b(bxl.f);
      }
   }

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.f);
   }
}
