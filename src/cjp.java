import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cjp extends cjg {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cjp(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      qw $$4 = $$3.v();
      if (!$$1.fT().d) {
         $$1.a($$2, cjl.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            rc $$5 = $$4.c("Recipes", 8);
            List<cmq<?>> $$6 = Lists.newArrayList();
            cmr $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cmq<?>> $$10 = $$7.a(new aez($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bhf.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(apq.c.b(this));
         }

         return bhf.a($$3, $$0.w_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bhf.d($$3);
      }
   }
}
