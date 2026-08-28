import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cfo extends cfq<coh> {
   private static final int a = 40;

   public cfo() {
      super(40);
   }

   protected void a(ard $$0, coh $$1) {
      aku<dgh> $$2 = $$0.ai();
      ji $$3 = $$1.dv();
      List<jq> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ji $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gC().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jq.a($$2, $$9));
               }
            }
         }
      }

      bwi<?> $$10 = $$1.eb();
      if (!$$4.isEmpty()) {
         $$10.a(cek.f, $$4);
      } else {
         $$10.b(cek.f);
      }
   }

   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.f);
   }
}
