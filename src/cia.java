import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cia extends cic<crj> {
   private static final int a = 40;

   public cia() {
      super(40);
   }

   protected void a(ars $$0, crj $$1) {
      alh<djx> $$2 = $$0.aj();
      iv $$3 = $$1.dv();
      List<je> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               iv $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gC().b().a().e().contains($$0.a_($$9).b())) {
                  $$4.add(je.a($$2, $$9));
               }
            }
         }
      }

      byu<?> $$10 = $$1.ec();
      if (!$$4.isEmpty()) {
         $$10.a(cgw.f, $$4);
      } else {
         $$10.b(cgw.f);
      }
   }

   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.f);
   }
}
