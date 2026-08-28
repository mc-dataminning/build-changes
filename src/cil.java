import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cil extends cin<cru> {
   private static final int a = 40;

   public cil() {
      super(40);
   }

   protected void a(asb $$0, cru $$1) {
      alq<dkj> $$2 = $$0.aj();
      iw $$3 = $$1.dv();
      List<jf> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               iw $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gF().b().a().e().contains($$0.a_($$9).b())) {
                  $$4.add(jf.a($$2, $$9));
               }
            }
         }
      }

      bzf<?> $$10 = $$1.ec();
      if (!$$4.isEmpty()) {
         $$10.a(chh.f, $$4);
      } else {
         $$10.b(chh.f);
      }
   }

   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.f);
   }
}
