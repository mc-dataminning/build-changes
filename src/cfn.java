import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cfn extends cfp<cog> {
   private static final int a = 40;

   public cfn() {
      super(40);
   }

   protected void a(arc $$0, cog $$1) {
      akt<dgg> $$2 = $$0.ai();
      ji $$3 = $$1.dw();
      List<jq> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ji $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gz().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jq.a($$2, $$9));
               }
            }
         }
      }

      bwh<?> $$10 = $$1.ec();
      if (!$$4.isEmpty()) {
         $$10.a(cej.f, $$4);
      } else {
         $$10.b(cej.f);
      }
   }

   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.f);
   }
}
