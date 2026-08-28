import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cfi extends cfk<cny> {
   private static final int a = 40;

   public cfi() {
      super(40);
   }

   protected void a(arn $$0, cny $$1) {
      alh<dfb> $$2 = $$0.ag();
      jh $$3 = $$1.dx();
      List<jp> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jh $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gE().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jp.a($$2, $$9));
               }
            }
         }
      }

      bwc<?> $$10 = $$1.ed();
      if (!$$4.isEmpty()) {
         $$10.a(cee.f, $$4);
      } else {
         $$10.b(cee.f);
      }
   }

   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.f);
   }
}
