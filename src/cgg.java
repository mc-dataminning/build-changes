import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cgg extends cgi<cpd> {
   private static final int a = 40;

   public cgg() {
      super(40);
   }

   protected void a(ard $$0, cpd $$1) {
      akt<dgz> $$2 = $$0.aj();
      ji $$3 = $$1.du();
      List<jq> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ji $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gA().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jq.a($$2, $$9));
               }
            }
         }
      }

      bxa<?> $$10 = $$1.ea();
      if (!$$4.isEmpty()) {
         $$10.a(cfc.f, $$4);
      } else {
         $$10.b(cfc.f);
      }
   }

   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.f);
   }
}
