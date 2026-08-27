import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cph extends coy {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cph(coy.a $$0) {
      super($$0);
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      sw $$4 = $$3.w();
      if (!$$1.fU().d) {
         $$1.a($$2, cpd.h);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            tc $$5 = $$4.c("Recipes", 8);
            List<csh<?>> $$6 = Lists.newArrayList();
            csi $$7 = $$0.o().aI();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<csh<?>> $$10 = $$7.a(new aiy($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return blx.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(atv.c.b(this));
         }

         return blx.a($$3, $$0.y_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return blx.d($$3);
      }
   }
}
