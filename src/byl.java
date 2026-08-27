import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class byl extends byn<cgu> {
   private static final int a = 40;

   public byl() {
      super(40);
   }

   protected void a(aov $$0, cgu $$1) {
      aix<cvn> $$2 = $$0.ae();
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

      bpf<?> $$10 = $$1.dO();
      if (!$$4.isEmpty()) {
         $$10.a(bxh.f, $$4);
      } else {
         $$10.b(bxh.f);
      }
   }

   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.f);
   }
}
