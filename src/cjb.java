import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cjb extends cis {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cjb(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      qr $$4 = $$3.v();
      if (!$$1.fR().d) {
         $$1.a($$2, cix.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            qx $$5 = $$4.c("Recipes", 8);
            List<cma<?>> $$6 = Lists.newArrayList();
            cmb $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<? extends cma<?>> $$10 = $$7.a(new aer($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bgr.d($$3);
               }

               $$6.add((cma<?>)$$10.get());
            }

            $$1.a($$6);
            $$1.b(apg.c.b(this));
         }

         return bgr.a($$3, $$0.r_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bgr.d($$3);
      }
   }
}
