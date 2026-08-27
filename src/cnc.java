import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cnc extends cmt {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cnc(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      sn $$4 = $$3.v();
      if (!$$1.fT().d) {
         $$1.a($$2, cmy.f);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            st $$5 = $$4.c("Recipes", 8);
            List<cqe<?>> $$6 = Lists.newArrayList();
            cqf $$7 = $$0.o().aG();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cqe<?>> $$10 = $$7.a(new ahg($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bkc.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(asc.c.b(this));
         }

         return bkc.a($$3, $$0.y_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bkc.d($$3);
      }
   }
}
