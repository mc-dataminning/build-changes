import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cfm extends cfo<coc> {
   private static final int a = 40;

   public cfm() {
      super(40);
   }

   protected void a(arq $$0, coc $$1) {
      alk<dff> $$2 = $$0.ag();
      jh $$3 = $$1.dy();
      List<jp> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jh $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gF().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jp.a($$2, $$9));
               }
            }
         }
      }

      bwg<?> $$10 = $$1.ee();
      if (!$$4.isEmpty()) {
         $$10.a(cei.f, $$4);
      } else {
         $$10.b(cei.f);
      }
   }

   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.f);
   }
}
