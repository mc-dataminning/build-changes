import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class ccw extends ccy<clj> {
   private static final int a = 40;

   public ccw() {
      super(40);
   }

   protected void a(aqm $$0, clj $$1) {
      akl<dax> $$2 = $$0.ae();
      io $$3 = $$1.dp();
      List<iw> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               io $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gA().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(iw.a($$2, $$9));
               }
            }
         }
      }

      btq<?> $$10 = $$1.dS();
      if (!$$4.isEmpty()) {
         $$10.a(cbs.f, $$4);
      } else {
         $$10.b(cbs.f);
      }
   }

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.f);
   }
}
