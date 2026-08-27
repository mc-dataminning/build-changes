import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class ccv extends ccx<cll> {
   private static final int a = 40;

   public ccv() {
      super(40);
   }

   protected void a(aqt $$0, cll $$1) {
      aks<dca> $$2 = $$0.af();
      ir $$3 = $$1.du();
      List<iz> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ir $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gL().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(iz.a($$2, $$9));
               }
            }
         }
      }

      btp<?> $$10 = $$1.dZ();
      if (!$$4.isEmpty()) {
         $$10.a(cbr.f, $$4);
      } else {
         $$10.b(cbr.f);
      }
   }

   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.f);
   }
}
