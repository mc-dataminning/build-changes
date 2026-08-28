import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class ceu extends cew<cnk> {
   private static final int a = 40;

   public ceu() {
      super(40);
   }

   protected void a(arj $$0, cnk $$1) {
      ald<dej> $$2 = $$0.ag();
      jf $$3 = $$1.ds();
      List<jn> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jf $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gy().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(jn.a($$2, $$9));
               }
            }
         }
      }

      bvo<?> $$10 = $$1.dY();
      if (!$$4.isEmpty()) {
         $$10.a(cdq.f, $$4);
      } else {
         $$10.b(cdq.f);
      }
   }

   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.f);
   }
}
