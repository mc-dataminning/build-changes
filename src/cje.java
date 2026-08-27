import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cje extends civ {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cje(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      qu $$4 = $$3.v();
      if (!$$1.fR().d) {
         $$1.a($$2, cja.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            ra $$5 = $$4.c("Recipes", 8);
            List<cmf<?>> $$6 = Lists.newArrayList();
            cmg $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cmf<?>> $$10 = $$7.a(new aeu($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bgu.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(apj.c.b(this));
         }

         return bgu.a($$3, $$0.r_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bgu.d($$3);
      }
   }
}
