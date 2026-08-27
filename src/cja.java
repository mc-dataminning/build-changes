import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cja extends cir {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cja(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      qs $$4 = $$3.v();
      if (!$$1.fR().d) {
         $$1.a($$2, ciw.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            qy $$5 = $$4.c("Recipes", 8);
            List<clz<?>> $$6 = Lists.newArrayList();
            cma $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<? extends clz<?>> $$10 = $$7.a(new aep($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bgp.d($$3);
               }

               $$6.add((clz<?>)$$10.get());
            }

            $$1.a($$6);
            $$1.b(ape.c.b(this));
         }

         return bgp.a($$3, $$0.r_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bgp.d($$3);
      }
   }
}
