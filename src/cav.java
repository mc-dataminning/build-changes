import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cav extends cax<cjg> {
   private static final int a = 40;

   public cav() {
      super(40);
   }

   protected void a(aps $$0, cjg $$1) {
      ajs<cyx> $$2 = $$0.ae();
      ib $$3 = $$1.dm();
      List<ik> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ib $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gy().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ik.a($$2, $$9));
               }
            }
         }
      }

      brp<?> $$10 = $$1.dP();
      if (!$$4.isEmpty()) {
         $$10.a(bzr.f, $$4);
      } else {
         $$10.b(bzr.f);
      }
   }

   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.f);
   }
}
