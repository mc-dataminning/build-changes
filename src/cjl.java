import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cjl extends cjc {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cjl(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      qy $$4 = $$3.v();
      if (!$$1.fS().d) {
         $$1.a($$2, cjh.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            re $$5 = $$4.c("Recipes", 8);
            List<cmm<?>> $$6 = Lists.newArrayList();
            cmn $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cmm<?>> $$10 = $$7.a(new aey($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bhb.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(app.c.b(this));
         }

         return bhb.a($$3, $$0.w_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bhb.d($$3);
      }
   }
}
