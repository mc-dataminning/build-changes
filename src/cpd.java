import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cpd extends cou {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cpd(cou.a $$0) {
      super($$0);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      sw $$4 = $$3.w();
      if (!$$1.fU().d) {
         $$1.a($$2, coz.h);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            tc $$5 = $$4.c("Recipes", 8);
            List<csd<?>> $$6 = Lists.newArrayList();
            cse $$7 = $$0.o().aG();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<csd<?>> $$10 = $$7.a(new aiy($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return blv.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(atu.c.b(this));
         }

         return blv.a($$3, $$0.y_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return blv.d($$3);
      }
   }
}
