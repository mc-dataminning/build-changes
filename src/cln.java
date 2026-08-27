import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cln extends cle {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cln(cle.a $$0) {
      super($$0);
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      rz $$4 = $$3.v();
      if (!$$1.fU().d) {
         $$1.a($$2, clj.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            sf $$5 = $$4.c("Recipes", 8);
            List<coq<?>> $$6 = Lists.newArrayList();
            cor $$7 = $$0.n().aG();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<coq<?>> $$10 = $$7.a(new agi($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return biy.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(arb.c.b(this));
         }

         return biy.a($$3, $$0.x_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return biy.d($$3);
      }
   }
}
