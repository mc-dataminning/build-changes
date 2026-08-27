import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cjj extends cja {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cjj(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      qy $$4 = $$3.v();
      if (!$$1.fS().d) {
         $$1.a($$2, cjf.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            re $$5 = $$4.c("Recipes", 8);
            List<cmk<?>> $$6 = Lists.newArrayList();
            cml $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cmk<?>> $$10 = $$7.a(new aex($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bgz.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(apo.c.b(this));
         }

         return bgz.a($$3, $$0.w_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bgz.d($$3);
      }
   }
}
